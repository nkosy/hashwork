package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.deductions.EmployeeMedicalAid;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/18.
 */
public class EmployeeMedicalAidTable extends Table {
    private final MainLayout main;

    public EmployeeMedicalAidTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Medical Aid Type", String.class, null);
        addContainerProperty("Medical Aid Amount", String.class, null);
        addContainerProperty("Last Date Contribution", String.class, null);

        Set<EmployeeMedicalAid>  employeeMedicalAidDataset = PayrollCoreDeductionsFacade.employeeMedicalAidService.findAll();

        for(EmployeeMedicalAid employeeMedicalAid: employeeMedicalAidDataset){
            addItem(new Object[]{employeeMedicalAid.getPersonId(),
                            employeeMedicalAid.getMedicalAidType(),
                            employeeMedicalAid.getMedicalAidAmount(),
                            employeeMedicalAid.getLastDateContribution()},
                    employeeMedicalAid.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
