import java.util.Date;

public class Transaction {
    private int transactionId;
    private Date transactionDate;
    private double amount;

    public Transaction(int transactionId,double amount){
        this.transactionId=transactionId;
        this.transactionDate= new Date();
        this.amount=amount;
    }
    public int getTransactionId(){
        return transactionId;
    }
    public Date getTansactionDate(){
        return transactionDate;
    }
    public double getAmount(){
        return amount;
    }

}
