package hashwork.client.content.payroll.model;

import com.vaadin.ui.FormLayout;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class EmployeeTaxCertificateModel implements Serializable {
    private String employer;
    private String taxReferenceNumber;
    private String uifNumber;
    private BigDecimal employeeTaxAmt;

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getTaxReferenceNumber() {
        return taxReferenceNumber;
    }

    public void setTaxReferenceNumber(String taxReferenceNumber) {
        this.taxReferenceNumber = taxReferenceNumber;
    }

    public String getUifNumber() {
        return uifNumber;
    }

    public void setUifNumber(String uifNumber) {
        this.uifNumber = uifNumber;
    }

    public BigDecimal getEmployeeTaxAmt() {
        return employeeTaxAmt;
    }

    public void setEmployeeTaxAmt(BigDecimal employeeTaxAmt) {
        this.employeeTaxAmt = employeeTaxAmt;
    }
}
