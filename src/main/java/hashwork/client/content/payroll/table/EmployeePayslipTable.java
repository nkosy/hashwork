package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.EmployeePayslip;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/17.
 */
public class EmployeePayslipTable extends Table {
    private final MainLayout main;

    public EmployeePayslipTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Net Pay", String.class, null);
        addContainerProperty("Payslip Generate Date", String.class, null);

        Set<EmployeePayslip> employeePayslips = PayrollCoreFacade.employeePayslipService.findAll();

        for(EmployeePayslip employeePayslip: employeePayslips){
            addItem(new Object[]{employeePayslip.getPersonId(),
                            employeePayslip.getNetPay(),
                            employeePayslip.getPayslipGenerateDate()},
                    employeePayslip.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
