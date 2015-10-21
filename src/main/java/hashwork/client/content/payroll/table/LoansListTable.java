package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.LoansList;

/**
 * Created by NkosikhonaS on 10/21/2015.
 */
public class LoansListTable extends Table {
    private final MainLayout main;

    public LoansListTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Loan Type", String.class, null);
        addContainerProperty("Loan Description", String.class, null);
        addContainerProperty("Loan Payback Period", String.class, null);
        addContainerProperty("Max Loan Amount", String.class, null);
        addContainerProperty("Standard Interest", String.class, null);

        Set<LoansList> loansListDataSet = PayrollUiFacade.loansListService.findAll();

        for(LoansList LoansList: loansListDataSet){
            addItem(new Object[]{LoansList.getLoanType(),
                            LoansList.getLoanDesc(),
                            LoansList.getLoanPaybackPeriod(),
                            LoansList.getMaxLoanAmt()},
                    LoansList.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
