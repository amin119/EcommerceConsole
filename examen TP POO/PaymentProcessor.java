import java.util.Map;
import java.util.Scanner;

public class PaymentProcessor {
    private static int paymentIdCounter = 1;

    public void processPayment(double amount) {
        System.out.println("Choose a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. Cash on Delivery");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        String paymentMethod;
        switch (choice) {
            case 1:
                paymentMethod = "Credit Card";
                break;
            case 2:
                paymentMethod = "PayPal";
                break;
            case 3:
                paymentMethod = "Cash on Delivery";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Credit Card.");
                paymentMethod = "Credit Card";
        }

        Payment payment = new Payment(paymentIdCounter++, amount, paymentMethod);

        System.out.println("Processing payment of amount: " + amount + " with " + paymentMethod);
        System.out.println("Payment successful!");
    }
    public void generatePaymentReceipt( ShoppingCart shoppingList) {
        System.out.println("Payment Receipt:\n ");
        shoppingList.displayShoppingCart();
    }
}
