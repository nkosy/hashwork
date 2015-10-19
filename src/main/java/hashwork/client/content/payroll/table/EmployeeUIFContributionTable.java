package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.deductions.EmployeeUIFContribution;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/18.
 */
public class EmployeeUIFContributionTable extends Table {
    private final MainLayout main;

    public EmployeeUIFContributionTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Country", String.class, null);
        addContainerProperty("Contribution", String.class, null);
        addContainerProperty("Current Amount", String.class, null);
        addContainerProperty("Last Contribution Date", String.class, null);

        Set<EmployeeUIFContribution> employeeUIFContributionDataSet = PayrollCoreDeductionsFacade.employeeUIFContributionService.findAll();

        for(EmployeeUIFContribution employeeUIFContribution: employeeUIFContributionDataSet){
            addItem(new Object[]{employeeUIFContribution.getPersonId(),
                            employeeUIFContribution.getCountry(),
                            employeeUIFContribution.getContribution(),
                            employeeUIFContribution.getCurrentAmount(),
                            employeeUIFContribution.getLastContributionDate()},
                    employeeUIFContribution.getId());
        }

        //Table properties
        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
