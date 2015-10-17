package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.CompanyPayroll;
import hashwork.domain.payroll.core.EmployeeEarnings;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/15.
 */
public class EmployeeEarningsTable extends Table {
    private final MainLayout main;

    public EmployeeEarningsTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Earnings Amount", String.class, null);
        addContainerProperty("Earnings Type Description", String.class, null);
        addContainerProperty("Earnings Code", String.class, null);
        addContainerProperty("Pay Date", String.class, null);

        Set<EmployeeEarnings> employeeEarnings_s = PayrollCoreFacade.employeeEarningService.findAll();
        for(EmployeeEarnings employeeEarnings: employeeEarnings_s){
            addItem(new Object[]{employeeEarnings.getPersonId(),
                            employeeEarnings.getEarningsAmt(),
                            employeeEarnings.getEarningsTypeDesc(),
                            employeeEarnings.getEarningsCode(),
                            employeeEarnings.getPayDate()},
                    employeeEarnings.getId());
        }
        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
