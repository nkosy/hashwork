package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.deductions.EmployeePension;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/18.
 */
public class EmployeePensionTable extends Table {
    private final MainLayout main;

    public EmployeePensionTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Start Date", String.class, null);
        addContainerProperty("Pension Code", String.class, null);
        addContainerProperty("Goal Amount", String.class, null);
        addContainerProperty("Last Contribution", String.class, null);
        addContainerProperty("Last Contribution Date", String.class, null);
        addContainerProperty("Contribution To Date", String.class, null);

        Set<EmployeePension> employeePensionDataSet = PayrollCoreDeductionsFacade.employeePensionService.findAll();

        for(EmployeePension employeePension: employeePensionDataSet){
            addItem(new Object[]{employeePension.getPersonId(),
                            employeePension.getStartDate(),
                            employeePension.getPensionCode(),
                            employeePension.getGoalAmount(),
                            employeePension.getLastContribution(),
                            employeePension.getContributionToDate()},
                    employeePension.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
