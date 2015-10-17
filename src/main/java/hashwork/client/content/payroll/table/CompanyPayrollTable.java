package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.CompanyPayroll;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/15.
 */
public class CompanyPayrollTable extends Table {
    private final MainLayout main;

    public CompanyPayrollTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Company ID", String.class, null);
        addContainerProperty("Pay Period", String.class, null);
        addContainerProperty("Employee Type", String.class, null);

        Set<CompanyPayroll> companyPayrolls = PayrollCoreFacade.companyPayrollService.findAll();

        for(CompanyPayroll companyPayroll: companyPayrolls){
            addItem(new Object[]{companyPayroll.getCompanyId(),
                            companyPayroll.getPayPeriod(),
                    companyPayroll.getPayPeriod(),
                    companyPayroll.getEmployeeType()},
                    companyPayroll.getId());
        }
        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
