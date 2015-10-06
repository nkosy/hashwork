package hashwork.client.content.payroll.model;

import java.math.BigDecimal;

/**
 * Created by NkosikhonaS on 10/6/2015.
 */
public class AllowanceTypeListModel {
    private String allowanceType;
    private String description;
    private BigDecimal maxAmount;

    public String getAllowanceType() {
        return allowanceType;
    }

    public void setAllowanceType(String allowanceType) {
        this.allowanceType = allowanceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }
}
