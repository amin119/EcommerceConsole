import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EcommercialMain {
    public static void main(String[] args) {
        AdminManager admin_manager = new AdminManager();
        Customer customer = new Customer();
        Inventory stock = new Inventory();
        ShoppingCart shoppingCart = new ShoppingCart();
        PaymentProcessor payment_processor= new PaymentProcessor();
        ProductReview product_review= new ProductReview();

        Scanner sc = new Scanner(System.in);

        int userType;
        do {
            System.out.println("Choose User Type:");
            System.out.println("Admin : 1");
            System.out.println("Customer : 2");
            System.out.println("Exit : 3");
            System.out.println("Enter your choice : ");
            userType = sc.nextInt();

            switch (userType) {
                case 1:
                    System.out.println("Admin Login:");
                    System.out.println("Login In : 1 ");
                    System.out.println("Sign Up : 2");
                    System.out.println("Enter your choice: ");
                    int choice = sc.nextInt();

                    switch (choice) {
                        case 1:
                            Admin admin = new Admin();
                            admin.setAdmin();
                            System.out.println("ID : ");
                            int id=sc.nextInt();
                            admin_manager.addAdmin(id, admin);
                            if (admin.logIn(admin.getAdminUsername(),admin.getAdminPassword())) {
                                int adminChoice;
                                do {
                                    admin.adminMenu();
                                    System.out.println("Enter your choice: ");
                                    adminChoice = sc.nextInt();

                                    switch (adminChoice) {
                                        case 1:
                                            stock.addProduct();
                                            break;
                                        case 2:
                                            stock.removeProduct();
                                            break;
                                        case 3:
                                            stock.updateProducts();
                                            break;
                                        case 4:
                                            stock.displayProducts();
                                            break;
                                        case 5 :
                                            System.out.println("Logout sucessfully ! GoodBye.");
                                        default :
                                            System.out.println("Invalid choice. Please enter a valid option.");
                                        
                                    }
                                } while (adminChoice != 5);
                            } else {
                                System.out.println("Invalid admin !  Please try again.");
                            }
                            break;

                        case 2:
                            Admin sign_admin = new Admin();
                            sign_admin.signIn();
                            System.out.println("ID : ");
                            int sign_id=sc.nextInt();
                            admin_manager.addAdmin(sign_id, sign_admin);
                            break;

                        default:
                            System.out.println("Invalid choice. Please enter a valid option.");
                    }
                    break;
                case 2:
                    int customerChoice;
                    System.out.println("Customer Login:");
                    System.out.println("Login In : 1 ");
                    System.out.println("Sign Up : 2");
                    System.out.println("Enter your choice: ");
                    customerChoice=sc.nextInt();
                    switch (customerChoice) {
                         case 1 : 
                            if(customer.logIn()){
                                do{
                                int customer_choice ;
                                customer.customerMenu();
                                System.out.println("Enter your choice: ");
                                customer_choice=sc.nextInt();
                                switch(customer_choice){
                                    case 1 :
                                        System.out.println("search by name : 1");
                                        System.out.println("Search by ID : 2 ");
                                        System.out.println("Enter your choice : ");
                                        int search_choice = sc.nextInt();
                                        switch(search_choice){
                                            case 1 :
                                                customer.view_product_list(stock.searchByName());
                                                break;
                                            case 2 : 
                                                stock.searchByID();
                                                break;
                                            default:
                                                System.out.println("Invalid choice. Please enter a valid option.");
                                                }
                                    case 2 : 
                                        System.out.println("do you want to search for a specific product : 1");
                                        System.out.println("View all products : 2");
                                        System.out.println("filter products by category : 3");
                                        System.out.println("filter products by price range : 4");
                                        System.out.println("filter products by availability : 5");
                                        System.out.println("filter products by quantity : 6");
                                        System.out.println("Entr you choice :");
                                        int view_choice =sc.nextInt();
                                        List<Product> view_list = new ArrayList<>();
                                        switch(customer_choice){
                                            case 1 :
                                                System.out.println("search by name : 1");
                                                System.out.println("Search by ID : 2 ");
                                                System.out.println("Enter your choice : ");
                                                int search2_choice = sc.nextInt();
                                                switch(search2_choice){
                                                    case 1 :
                                                        customer.view_product_list(stock.searchByName());
                                                        break;
                                                    case 2 : 
                                                        stock.searchByID();
                                                        break;
                                                    default:
                                                        System.out.println("Invalid choice. Please enter a valid option.");
                                                }
                                                break;
                                            case 2 :
                                                stock.displayProducts();
                                                break;
                                            case 3 :
                                                customer.view_product_list(stock.filterbyCategory());
                                                break;
                                            case 4 :
                                                customer.view_product_list(stock.filterByPriceRange());
                                                break;
                                            case 5 :
                                                customer.view_product_list(stock.filterByAvailability());
                                                break;
                                            case 6 :
                                                customer.view_product_list(stock.filterByQuantity());
                                                break;
                                            default :
                                                System.out.println("Invalid choice. Please enter a valid option.");
                                        }
                                        break;
                                    case 3 :
                                        System.out.println("ID : ");
                                        int add_id= sc.nextInt();
                                        System.out.println("Quantity : ");
                                        double add_quantity =sc.nextDouble();
                                        shoppingCart.addProduct(add_id,add_quantity,stock);
                                        break;
                                    case 4 :
                                        System.out.println("ID : ");
                                        int update_id= sc.nextInt();
                                        System.out.println("Quantity (you will reset the quantity) : ");
                                        double update_quantity =sc.nextDouble();
                                        shoppingCart.updateProductQuantity(update_id,update_quantity,stock);
                                        break;
                                    case 5 : 
                                        shoppingCart.displayShoppingCart();
                                        break;
                                    case 6 : 
                                        System.out.println("Do you like to order what you have in your shopping card ?");
                                        String order_choice ;
                                        System.out.println("Yes : 1");
                                        System.out.println("No : 2");
                                        order_choice=sc.nextLine();
                                        order_choice=order_choice.toLowerCase();
                                        switch (order_choice) {
                                            case "yes":
                                                Order order= new Order(shoppingCart.getShoppingCart());
                                                order.calculateTotalPrice();
                                                if (order.getTotalPrice()>=100){
                                                    System.out.println("Enter the ID of any product you have : ");
                                                    int id=sc.nextInt();
                                                    Discount discount = new Discount();
                                                    discount.setDiscount(5);
                                                    order.setTotalPrice(customer_choice);
                                                    shoppingCart.applyDiscount(id, discount);
                                                    discount.setDiscount(order.getTotalPrice()*0.95);
                                                }
                                                else if (order.getTotalPrice()>=300){
                                                    System.out.println("Enter the ID of any product you have : ");
                                                    int discount_id=sc.nextInt();
                                                    Discount discount1 = new Discount();
                                                    discount1.setDiscount(10);
                                                    order.setTotalPrice(customer_choice);
                                                    shoppingCart.applyDiscount(discount_id, discount1);
                                                    discount1.setDiscount(order.getTotalPrice()*0.90);                                                   
                                                }else{
                                                    continue;
                                                }
                                                order.completeOrder();
                                                payment_processor.processPayment(order.getTotalPrice());
                                                System.out.println("Do you like to get a receipt ?");
                                                System.out.println("Yes : 1");
                                                System.out.println("No : 2");
                                                System.out.println("Enter your choice :");
                                                String receipt_choice=sc.nextLine();
                                                receipt_choice=order_choice.toLowerCase();
                                                switch (receipt_choice) {
                                                    case "yes":
                                                        payment_processor.generatePaymentReceipt(shoppingCart);  
                                                        break;
                                                    case "no":
                                                        System.out.println("Thank you for your shopping and have a nice day ! ");
                                                        break;
                                                    default:
                                                        System.out.println("Invalid choice. Please enter a valid option.");
                                                }
                                                break;   
                                            case "no":
                                                System.out.println("You can complete your shopping ! ");
                                            default:
                                                System.out.println("Invalid choice. Please enter a valid option.");
                                        }
                                        break;
                                    case 7: 
                                        System.out.println("Reenter your name : ");
                                        String username=sc.nextLine();
                                        System.out.println("Rate our service : ");
                                        int rate = sc.nextInt();
                                        System.out.println("Add a comment : ");
                                        String comment=sc.nextLine();
                                        product_review.addReview(username, rate, comment);
                                        System.out.println("Do you want to see the previous reviews ? ");
                                        System.out.println("Yes : 1 ");
                                        System.out.println("No : 1 ");
                                        System.out.println("Enter your choice : ");
                                        String rating_choice =sc.nextLine();
                                        rating_choice=rating_choice.toLowerCase();
                                        switch (rating_choice) {
                                            case "yes":
                                                product_review.displayReviews();
                                                System.out.println("The average of rating is : "+product_review.getAverageRating());
                                                break;
                                            case "no":
                                                System.out.println("Ok you can continue !");
                                                break;
                                            default:
                                                System.out.println("Invalid choice. Please enter a valid option.");
                                        }
                                        break; 
                                    case 8 : 
                                        System.out.println("Log out was sucessful ! GoodBye");
                                        break;
                                    default:
                                        System.out.println("Invalid choice. Please enter a valid option.");          
                            } 
                        }while(customerChoice !=8);}
                        break; 
                        case 2 :
                            System.out.println(customer.signUp());
                            break;
                    }

                    break;

                case 3:
                    System.out.println("Exiting the application. Thank you !");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (userType != 3);
    }
}

    