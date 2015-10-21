package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.TaxCodes;

/**
 * Created by NkosikhonaS on 10/21/2015.
 */
public class TaxCodesTable extends Table {
    private final MainLayout main;

    public TaxCodesTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("code", String.class, null);
        addContainerProperty("Code Type", String.class, null);
        addContainerProperty("Code Decription", String.class, null);

        Set<TaxCodes> taxCodesDataSet = PayrollUiFacade.taxCodesService.findAll();

        for(TaxCodes taxCodes: taxCodesDataSet){
            addItem(new Object[]{taxCodes.getCode(),
                            taxCodes.getCodeType(),
                            taxCodes.getCodeDecription()},
                    taxCodes.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
