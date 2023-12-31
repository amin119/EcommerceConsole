import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Customer {
    
    private String username;
    private String password;
    private ShoppingCart shoppingCart;
    private static Map<String, Customer> customer_list = new HashMap<>();

    public Customer(){}

    public Customer(String username, String password) {
        this.shoppingCart = new ShoppingCart();
        this.username = username;
        this.password = password;
    }
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }


    public static String  signUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new username: ");
        String newUsername = sc.nextLine();

        if (customer_list.containsKey(newUsername)) {
            return "Username already exists. Please choose a different one.";
        }

        System.out.println("Enter a password: ");
        String newPassword = sc.nextLine();
        Customer newCustomer = new Customer(newUsername, newPassword);
        customer_list.put(newUsername, newCustomer);
        return "Account created successfully!";

    }
    public static boolean logIn() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String inputUsername = sc.nextLine();

        if (!customer_list.containsKey(inputUsername)) {
            System.out.println("Username not found. Please sign up or check your credentials.");
            return false;   
        }

        Customer customer = customer_list.get(inputUsername);

        System.out.println("Enter your password: ");
        String inputPassword = sc.nextLine();

        if (!customer.password.equals(inputPassword)) {
            System.out.println("Incorrect password. Please check your credentials.");
            return false;
        }

        System.out.println("Login successful!");
        return true;
    }
    public void viewList(List<Product> view_product_list){
        for(Product product : view_product_list){
            System.out.println(product.toString());
        }
    }

    public void customerMenu() {
        System.out.println("--------Customer Menu-------");
        System.out.println("search for a product : 1");
        System.out.println("View Products : 2 ");
        System.out.println("Add to Cart : 3");
        System.out.println("Update Cart : 4");
        System.out.println("View Cart : 5 ");
        System.out.println("Order right now : 6 ");
        System.out.println("Add a review : 7 ");
        System.out.println("Logout : 8");

    }

    public void view_product_list(List<Product> searchByName) {
    }    
}
