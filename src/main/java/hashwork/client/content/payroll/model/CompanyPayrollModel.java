package hashwork.client.content.payroll.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class CompanyPayrollModel implements Serializable {
    private String companyId;
    private Date payPeriod;
    private String employeeType;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Date getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(Date payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CompanyPayrollModel that = (CompanyPayrollModel) o;

        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null)
            return false;
        if (payPeriod != null ? !payPeriod.equals(that.payPeriod) : that.payPeriod != null)
            return false;
        return !(employeeType != null ? !employeeType.equals(that.employeeType) : that.employeeType != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (payPeriod != null ? payPeriod.hashCode() : 0);
        result = 31 * result + (employeeType != null ? employeeType.hashCode() : 0);
        return result;
    }
}

