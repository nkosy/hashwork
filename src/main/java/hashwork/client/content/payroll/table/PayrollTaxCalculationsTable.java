package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.PayrollTaxCalculations;

/**
 * Created by NkosikhonaS on 10/21/2015.
 */
public class PayrollTaxCalculationsTable extends Table {
    private final MainLayout main;

    public PayrollTaxCalculationsTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("taxCodesId", String.class, null);

        Set<PayrollTaxCalculations> payrollTaxCalculationsDataSet = PayrollUiFacade.payrollTaxCalculationsService.findAll();

        for(PayrollTaxCalculations payrollTaxCalculations: payrollTaxCalculationsDataSet){
            addItem(new Object[]{payrollTaxCalculations.getTaxCodesId()},
                    payrollTaxCalculations.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
