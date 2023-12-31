import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {
    private Map<Integer,Product> orderedProducts;
    private double totalPrice;
    private boolean finish;
    private List<Transaction> transactions;

    public Order(Map<Integer,Product> orderedProducts){
        this.orderedProducts= new HashMap<>();
        calculateTotalPrice();
        transactions = new ArrayList<>();
    }
    public void calculateTotalPrice(){
        for(Map.Entry<Integer,Product> item : orderedProducts.entrySet()){
            Product product=item.getValue();
            double price=product.getPrice();
            totalPrice+=price;           
        }
    }
            public void setTotalPrice(double discountPercentage){
            this.totalPrice=discountPercentage;
        }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void completeOrder(){
        if (!finish){
            System.out.println("Order completed. Total price :"+totalPrice );
            transactions.add(new Transaction(transactions.size()+1,totalPrice));
            finish=true;
        }else{
            System.out.println("Order has already been completed.");
        }
    }
    public void displayTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available for this order.");
        } else {
            System.out.println("Transactions for Order:");
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
                System.out.println("----------------------------");
            }
        }
    }
}

