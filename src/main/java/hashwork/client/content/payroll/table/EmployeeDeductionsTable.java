package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.deductions.EmployeeDeductions;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/18.
 */
public class EmployeeDeductionsTable extends Table {
    private final MainLayout main;

    public EmployeeDeductionsTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("deductionAmt", String.class, null);
        addContainerProperty("deductionTypeDesc", String.class, null);

        Set<EmployeeDeductions> employeeDeductions_s = PayrollCoreDeductionsFacade.employeeDeductionsServices.findAll();

        for(EmployeeDeductions employeeDeductions: employeeDeductions_s){
            addItem(new Object[]{employeeDeductions.getPersonId(),
                            employeeDeductions.getDeductionAmt(),
                            employeeDeductions.getDeductionTypeDesc()},
                    employeeDeductions.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
