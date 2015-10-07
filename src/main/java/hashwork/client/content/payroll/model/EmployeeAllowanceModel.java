package hashwork.client.content.payroll.model;

import com.vaadin.ui.FormLayout;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeeAllowanceModel implements Serializable {
    private String personId;
    private String allowanceType;
    private BigDecimal amount;
    private Date validAsFrom;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getAllowanceType() {
        return allowanceType;
    }

    public void setAllowanceType(String allowanceType) {
        this.allowanceType = allowanceType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getValidAsFrom() {
        return validAsFrom;
    }

    public void setValidAsFrom(Date validAsFrom) {
        this.validAsFrom = validAsFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EmployeeAllowanceModel that = (EmployeeAllowanceModel) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null)
            return false;
        if (allowanceType != null ? !allowanceType.equals(that.allowanceType) : that.allowanceType != null)
            return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        return !(validAsFrom != null ? !validAsFrom.equals(that.validAsFrom) : that.validAsFrom != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (allowanceType != null ? allowanceType.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (validAsFrom != null ? validAsFrom.hashCode() : 0);
        return result;
    }
}
