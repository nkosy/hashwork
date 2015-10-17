package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.TaxThresholds;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/17.
 */
public class TaxThresholdsTable extends Table {
    private final MainLayout main;

    public TaxThresholdsTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Tax Threshold Amount 1", String.class, null);
        addContainerProperty("Tax Threshold Amount 2", String.class, null);
        addContainerProperty("Tax Threshold Category", String.class, null);
        addContainerProperty("Tax Threshold Description", String.class, null);
        addContainerProperty("Tax Percentage", String.class, null);

        Set<TaxThresholds> taxThresholds_s = PayrollCoreFacade.taxThresholdsService.findAll();
        for(TaxThresholds taxThresholds: taxThresholds_s){
            addItem(new Object[]{taxThresholds.getPersonId(),
                            taxThresholds.getTaxPercentage(),
                            taxThresholds.getTaxThreshAmt1(),
                            taxThresholds.getTaxThreshCategory(),
                            taxThresholds.getTaxThreshDesc(),
                            taxThresholds.getTaxPercentage()},
                    taxThresholds.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
