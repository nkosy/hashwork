package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.EarningsList;

/**
 * Created by NkosikhonaS on 10/21/2015.
 */
public class EarningsListTable extends Table {
    private final MainLayout main;

    public EarningsListTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Earnings Type", String.class, null);
        addContainerProperty("Earnings Description", String.class, null);

        Set<EarningsList> EarningsListDataSet = PayrollUiFacade.earningListService.findAll();

        for(EarningsList earningsList: EarningsListDataSet){
            addItem(new Object[]{ earningsList.getEarningsType(),
                            earningsList.getEarningsDesc()},
                    earningsList.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
