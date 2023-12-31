import java.util.Date;

public class Payment {
    private int paymentId;
    private double amount;
    private Date paymentDate;
    private String paymentMethod;

    public Payment(int paymentId, double amount, String paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentDate = new Date();
    }

    public int getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
    public String toString() {
        return "Payment ID: " + paymentId +"\nAmount: " + amount +"\nPayment Date: " + paymentDate +"\nPayment Method: " + paymentMethod;
    }
}