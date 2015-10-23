package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.deductions.AllowanceTypeList;

/**
 * Created by NkosikhonaS on 10/23/2015.
 */
public class AllowanceTypeListTable extends Table {
    private final MainLayout main;

    public AllowanceTypeListTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Allowance Type", String.class, null);
        addContainerProperty("description", String.class, null);
        addContainerProperty("Max Amount", String.class, null);

        Set<AllowanceTypeList> allowanceTypeListDataSet = PayrollUiDeductionsFacade.allowanceTypeListService.findAll();

        for(AllowanceTypeList allowanceTypeList: allowanceTypeListDataSet){
            addItem(new Object[]{allowanceTypeList.getAllowanceType(),
                            allowanceTypeList.getDescription(),
                            allowanceTypeList.getMaxAmount()},
                    allowanceTypeList.getId());
        }
        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);

    }
}
