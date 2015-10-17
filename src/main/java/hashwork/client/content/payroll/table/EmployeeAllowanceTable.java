package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.EmployeeAllowance;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/15.
 */
public class EmployeeAllowanceTable extends Table {
    private final MainLayout main;

    public EmployeeAllowanceTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);

        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Allowance Type", String.class, null);
        addContainerProperty("Amount", String.class, null);
        addContainerProperty("Valid As From", String.class, null);

        Set<EmployeeAllowance> employeeAllowances = PayrollCoreFacade.employeeAllowanceService.findAll();

        for(EmployeeAllowance employeeAllowance: employeeAllowances){
            addItem(new Object[]{employeeAllowance.getPersonId(),
                            employeeAllowance.getAllowanceType(),
                            employeeAllowance.getAmount(),
                            employeeAllowance.getValidAsFrom()},
                    employeeAllowance.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
