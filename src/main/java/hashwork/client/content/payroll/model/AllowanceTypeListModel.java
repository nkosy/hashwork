package hashwork.client.content.payroll.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by NkosikhonaS on 10/6/2015.
 */
public class AllowanceTypeListModel implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AllowanceTypeListModel that = (AllowanceTypeListModel) o;

        if (allowanceType != null ? !allowanceType.equals(that.allowanceType) : that.allowanceType != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        return !(maxAmount != null ? !maxAmount.equals(that.maxAmount) : that.maxAmount != null);

    }

    @Override
    public int hashCode() {
        int result = allowanceType != null ? allowanceType.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (maxAmount != null ? maxAmount.hashCode() : 0);
        return result;
    }
}
