package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;
import hashwork.app.facade.PayrollCoreDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.core.deductions.EmployeeLeaveData;

import java.util.Set;

/**
 * Created by nkosi on 2015/10/18.
 */
public class EmployeeLeaveDataTale extends Table {
    private final MainLayout main;

    public EmployeeLeaveDataTale(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Person ID", String.class, null);
        addContainerProperty("Leave Type", String.class, null);
        addContainerProperty("Paid Leave", String.class, null);
        addContainerProperty("Days Taken", String.class, null);
        addContainerProperty("Commencement Date", String.class, null);

        Set<EmployeeLeaveData> employeeLeaveDataSet = PayrollCoreDeductionsFacade.employeeLeaveDataService.findAll();

        for(EmployeeLeaveData employeeLeaveData: employeeLeaveDataSet){
            addItem(new Object[]{employeeLeaveData.getPersonId(),
                            employeeLeaveData.getLeaveType(),
                            employeeLeaveData.isPaidLeave(),
                            employeeLeaveData.getDaysTaken(),
                            employeeLeaveData.getCommencementDate()},
                    employeeLeaveData.getId());
        }

        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
