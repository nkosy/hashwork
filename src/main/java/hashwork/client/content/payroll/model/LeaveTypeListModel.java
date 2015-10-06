package hashwork.client.content.payroll.model;

/**
 * Created by NkosikhonaS on 10/6/2015.
 */
public class LeaveTypeListModel {
    private String leaveType;
    private String description;
    private boolean paidLeave;
    private int maxLeaveDays;

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPaidLeave() {
        return paidLeave;
    }

    public void setPaidLeave(boolean paidLeave) {
        this.paidLeave = paidLeave;
    }

    public int getMaxLeaveDays() {
        return maxLeaveDays;
    }

    public void setMaxLeaveDays(int maxLeaveDays) {
        this.maxLeaveDays = maxLeaveDays;
    }
}
