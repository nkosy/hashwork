package hashwork.client.content.payroll.model;

import com.vaadin.ui.FormLayout;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeeEarningsModel implements Serializable {
    private String personId;
    private BigDecimal earningsAmt;
    private String earningsTypeDesc;
    private String earningsCode;
    private Date payDate;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public BigDecimal getEarningsAmt() {
        return earningsAmt;
    }

    public void setEarningsAmt(BigDecimal earningsAmt) {
        this.earningsAmt = earningsAmt;
    }

    public String getEarningsTypeDesc() {
        return earningsTypeDesc;
    }

    public void setEarningsTypeDesc(String earningsTypeDesc) {
        this.earningsTypeDesc = earningsTypeDesc;
    }

    public String getEarningsCode() {
        return earningsCode;
    }

    public void setEarningsCode(String earningsCode) {
        this.earningsCode = earningsCode;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        EmployeeEarningsModel that = (EmployeeEarningsModel) o;

        if (personId != null ? !personId.equals(that.personId) : that.personId != null)
            return false;
        if (earningsAmt != null ? !earningsAmt.equals(that.earningsAmt) : that.earningsAmt != null)
            return false;
        if (earningsTypeDesc != null ? !earningsTypeDesc.equals(that.earningsTypeDesc) : that.earningsTypeDesc != null)
            return false;
        if (earningsCode != null ? !earningsCode.equals(that.earningsCode) : that.earningsCode != null)
            return false;
        return !(payDate != null ? !payDate.equals(that.payDate) : that.payDate != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (earningsAmt != null ? earningsAmt.hashCode() : 0);
        result = 31 * result + (earningsTypeDesc != null ? earningsTypeDesc.hashCode() : 0);
        result = 31 * result + (earningsCode != null ? earningsCode.hashCode() : 0);
        result = 31 * result + (payDate != null ? payDate.hashCode() : 0);
        return result;
    }
}
