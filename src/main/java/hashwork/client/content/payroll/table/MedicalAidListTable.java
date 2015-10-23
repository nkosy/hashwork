package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.deductions.MedicalAidList;

/**
 * Created by NkosikhonaS on 10/23/2015.
 */
public class MedicalAidListTable extends Table {
    private final MainLayout main;

    public MedicalAidListTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Medical Aid Type", String.class, null);
        addContainerProperty("Description", String.class, null);
        addContainerProperty("Monthly Contribution", String.class, null);

        Set<MedicalAidList> medicalAidListDataSet = PayrollUiDeductionsFacade.medicalAidListService.findAll();

        for(MedicalAidList medicalAidList: medicalAidListDataSet){
            addItem(new Object[]{medicalAidList.getMedicalAidType(),
                            medicalAidList.getDescription(),
                            medicalAidList.getMonthlyContribution()},
                    medicalAidList.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
