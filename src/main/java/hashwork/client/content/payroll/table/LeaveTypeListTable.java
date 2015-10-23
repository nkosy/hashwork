package hashwork.client.content.payroll.table;

import com.vaadin.ui.Table;

import java.util.Set;

import hashwork.app.facade.PayrollUiDeductionsFacade;
import hashwork.client.content.MainLayout;
import hashwork.domain.payroll.ui.deductions.LeaveTypeList;

/**
 * Created by NkosikhonaS on 10/23/2015.
 */
public class LeaveTypeListTable extends Table {
    private final MainLayout main;

    public LeaveTypeListTable(MainLayout main) {
        this.main = main;
        setSizeFull();
        addContainerProperty("Id", String.class, null);
        addContainerProperty("Leave Type", String.class, null);
        addContainerProperty("Description", String.class, null);
        addContainerProperty("Paid Leave", String.class, null);
        addContainerProperty("Max Leave Days", String.class, null);

        Set<LeaveTypeList> leaveTypeListDataSet = PayrollUiDeductionsFacade.leaveTypeListService.findAll();

        for(LeaveTypeList leaveTypeList: leaveTypeListDataSet){
            addItem(new Object[]{leaveTypeList.getLeaveType(),
                            leaveTypeList.getDescription(),
                            leaveTypeList.isPaidLeave(),
                            leaveTypeList.getMaxLeaveDays()},
                    leaveTypeList.getId());
        }
        setNullSelectionAllowed(false);
        setSelectable(true);
        setImmediate(true);
    }
}
