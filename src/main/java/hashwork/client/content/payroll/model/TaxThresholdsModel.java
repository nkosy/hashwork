package hashwork.client.content.payroll.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by NkosikhonaS on 10/7/2015.
 */
public class TaxThresholdsModel implements Serializable {
    private String personId;
    private BigDecimal taxThreshAmt1;
    private BigDecimal taxThreshAmt2;
    private String taxThreshCategory;
    private String taxThreshDesc;
    private BigDecimal taxPercentage;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public BigDecimal getTaxThreshAmt1() {
        return taxThreshAmt1;
    }

    public void setTaxThreshAmt1(BigDecimal taxThreshAmt1) {
        this.taxThreshAmt1 = taxThreshAmt1;
    }

    public BigDecimal getTaxThreshAmt2() {
        return taxThreshAmt2;
    }

    public void setTaxThreshAmt2(BigDecimal taxThreshAmt2) {
        this.taxThreshAmt2 = taxThreshAmt2;
    }

    public String getTaxThreshCategory() {
        return taxThreshCategory;
    }

    public void setTaxThreshCategory(String taxThreshCategory) {
        this.taxThreshCategory = taxThreshCategory;
    }

    public String getTaxThreshDesc() {
        return taxThreshDesc;
    }

    public void setTaxThreshDesc(String taxThreshDesc) {
        this.taxThreshDesc = taxThreshDesc;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
}
