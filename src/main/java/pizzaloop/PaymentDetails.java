package pizzaloop;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class PaymentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer paymentId;
    private String cardNo;

    public Integer getPaymentId() {
        return paymentId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getPinNo() {
        return pinNo;
    }

    public Date getDateOfexp() {
        return dateOfexp;
    }

    private String pinNo;
    private Date dateOfexp;

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setPinNo(String pinNo) {
        this.pinNo = pinNo;
    }

    public void setDateOfexp(Date dateOfexp) {
        this.dateOfexp = dateOfexp;
    }
}
