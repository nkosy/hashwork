package hashwork.client.content.payroll.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeePayslipModel implements Serializable {
    private String personId;
    private BigDecimal netPay;
    private Date payslipGenerateDate;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public BigDecimal getNetPay() {
        return netPay;
    }

    public void setNetPay(BigDecimal netPay) {
        this.netPay = netPay;
    }

    public Date getPayslipGenerateDate() {
        return payslipGenerateDate;
    }

    public void setPayslipGenerateDate(Date payslipGenerateDate) {
        this.payslipGenerateDate = payslipGenerateDate;
    }
}
