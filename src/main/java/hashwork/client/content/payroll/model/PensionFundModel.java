package hashwork.client.content.payroll.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by NkosikhonaS on 10/6/2015.
 */
public class PensionFundModel implements Serializable {
    private String pensionCode;
    private String description;
    private BigDecimal percentage;
    private Date percentageAsOfDate;

    public String getPensionCode() {
        return pensionCode;
    }

    public void setPensionCode(String pensionCode) {
        this.pensionCode = pensionCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public Date getPercentageAsOfDate() {
        return percentageAsOfDate;
    }

    public void setPercentageAsOfDate(Date percentageAsOfDate) {
        this.percentageAsOfDate = percentageAsOfDate;
    }
}
