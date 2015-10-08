package hashwork.client.content.payroll.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by NkosikhonaS on 10/8/2015.
 */
public class EmployeeMedicalAidModel implements Serializable {
    private String personId;
    private String medicalAidType;
    private BigDecimal medicalAidAmount;
    private Date lastDateContribution;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getMedicalAidType() {
        return medicalAidType;
    }

    public void setMedicalAidType(String medicalAidType) {
        this.medicalAidType = medicalAidType;
    }

    public BigDecimal getMedicalAidAmount() {
        return medicalAidAmount;
    }

    public void setMedicalAidAmount(BigDecimal medicalAidAmount) {
        this.medicalAidAmount = medicalAidAmount;
    }

    public Date getLastDateContribution() {
        return lastDateContribution;
    }

    public void setLastDateContribution(Date lastDateContribution) {
        this.lastDateContribution = lastDateContribution;
    }
}
