import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Inventory {
    private Map<Integer,Product> products_list;
    public Inventory(){
        products_list=new HashMap<>();
    }
    public Map<Integer,Product> getProductsList(){
        return products_list;
    }
    public void addProduct(){
        System.out.println("Add a computer science product : 1");
        System.out.println("Add a Beauty, health and Fashion product : 2");
        System.out.println("Add a Games and toys product : 3");
        System.out.println("Add a gaming product : 4");
        System.out.println("Add a talephone product : 5");
        System.out.println("Add a impression product : 6");
        Scanner sc =new Scanner(System.in);
        System.out.println("What type of product you want to add : ");
        int choice = sc.nextInt();
        Product product;
        switch(choice){
            case 1 :
                product= new ComputerScience();
                product.setProduct();
                products_list.put(product.getId(),product);
                System.out.println(product.getName()+" hase been added sucessfully");
                break;
            case 2 :
                product= new Beauty_HealthFashion();
                product.setProduct();
                products_list.put(product.getId(),product);
                System.out.println(product.getName()+" hase been added sucessfully");
                break;
            case 3 :
                product= new GamesToys();
                product.setProduct();
                products_list.put(product.getId(),product);
                System.out.println(product.getName()+" hase been added sucessfully");
                break;
            case 4 :
                product= new Gaming();
                product.setProduct();
                products_list.put(product.getId(),product);
                System.out.println(product.getName()+" hase been added sucessfully");
                break;
            case 5 :
                product= new Telephone();
                product.setProduct();
                products_list.put(product.getId(),product);
                System.out.println(product.getName()+" hase been added sucessfully");
                break;
            case 6 :
                product= new Impression();
                product.setProduct();
                products_list.put(product.getId(),product);
                System.out.println(product.getName()+" hase been added sucessfully");
                break;
            }
    }
    public void removeProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID :");
        int id=sc.nextInt();
        if(products_list.containsKey(id)){
            System.out.println(products_list.get(id).getName()+" has been removed sucessfully");
            products_list.remove(id);

        }else{
            System.out.println("Invalid ID !! please try again");
        }

    }
    public void displayProducts(){
        System.out.println("------------All products------------- ");   
        for(Map.Entry<Integer,Product> item : products_list.entrySet()){
            int id = item.getKey();
            Product product = item.getValue();
            System.out.println("Product ID : "+id);
            System.out.println("Product name : "+product.getName());
            System.out.println("Quantity : "+ product.getQuantity());
            System.out.println("Price : "+product.getPrice());
            System.out.println("=======================");
            }      
        }
    public void updateProducts (){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the product ID : ");
        int id= sc.nextInt();
        if (products_list.containsKey(id)){
            System.out.println("Increase quantity: 1");
            System.out.println("Decrease quantity: 2");
            System.out.println("change price : 3");
            System.out.println("Enter your number : ");
            int choice = sc.nextInt();
            Product product= products_list.get(id);
            switch(choice){
                case 1:
                    System.out.println("Enter quantity : ");
                    double i_quantity= sc.nextDouble();
                    product.setQuantity(i_quantity+product.getQuantity());
                    System.out.println("quantity has been added sucessfully");
                    break;
                case 2 :
                    System.out.println("Enter quantity : ");
                    double d_quantity= sc.nextDouble();
                    product.setQuantity(product.getQuantity()-d_quantity);
                    if (d_quantity>=product.getQuantity()){
                        System.out.println("The quantity you've decreased is bigger than the actual quantity of this product, so this productt is out of stock");
                    }else{
                        System.out.println("Quantity has been dreased sucessfully ! The actual quantity now is : "+product.getQuantity());
                    }
                case 3 : 
                    System.out.println("Enter the new price : ");
                    double price= sc.nextDouble();
                    if (price<= 0){
                        System.out.println("Invalid price, please try again");
                    }else{
                        product.setPrice(price);
                        System.out.println("Price has been changed sucessfully");
                    }
            }
        }   
    }
    public void searchByID(){
        List<Product> searchResults = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("ID : ");
        int id = sc.nextInt();
        for(Product product : products_list.values()){
            if(products_list.containsKey(id)){
                System.out.println(product.toString());
                break;
            }else{
                System.out.println("Invalid ID, please try again ");
            }

        }
    }
    public List<Product> searchByName(){
        List<Product> searchResults = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Name : ");
        String name = sc.nextLine();
        for(Product product : products_list.values()){
            if(product.getName().toLowerCase().contains(name.toLowerCase())){
                searchResults.add(product);
            }
        }
        return searchResults;
    }
    public List<Product> filterbyCategory(){
        List<Product> filteredProducts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Search for computer science product : 1");
        System.out.println("Search for Beauty, health and Fashion product : 2");
        System.out.println("Search for Games and toys product : 3");
        System.out.println("Search for gaming product : 4");
        System.out.println("Search for talephone product : 5");
        System.out.println("Search for impression product : 6");
        System.out.println("What type of product you want to search for : ");
        int choice =sc.nextInt();
        switch(choice){
            case 1 :
                for(Product product : products_list.values()){
                    if (product instanceof ComputerScience){
                        filteredProducts.add(product);
                    }
                }
            case 2 :
                for(Product product : products_list.values()){
                    if (product instanceof Beauty_HealthFashion){
                        filteredProducts.add(product);
                    }
                }
            case 3 :
                for(Product product : products_list.values()){
                    if (product instanceof GamesToys){
                        filteredProducts.add(product);
                    }
                }
            case 4 :
                for(Product product : products_list.values()){
                    if (product instanceof Gaming){
                        filteredProducts.add(product);
                    }
                }
            case 5 :
                for(Product product : products_list.values()){
                    if (product instanceof Telephone){
                        filteredProducts.add(product);
                    }
                }
            case 6 :
                for(Product product : products_list.values()){
                    if (product instanceof Impression){
                        filteredProducts.add(product);
                    }
                }

        }
        return filteredProducts;
    }
    public List<Product> filterByPriceRange(){
        List<Product> filteredProducts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double maxPrice;
        double minPrice;
        do{
            System.out.println("Max : ");
            maxPrice=sc.nextInt();
            System.out.println("Min : ");
            minPrice=sc.nextInt();
        }while(maxPrice>minPrice);
        for (Product product : products_list.values()){
            double productPrice=product.getPrice();
            if (productPrice>= minPrice && productPrice <= maxPrice){
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
    public List<Product> filterByAvailability(){
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products_list.values()) {
            if (product.getQuantity() > 0 ) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;  
    }
    public List<Product> filterByQuantity(){
        List<Product> filteredProducts = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Quantity : ");
        double minQuantity=sc.nextDouble();
        for (Product product : products_list.values()) {
            if (product.getQuantity() >= minQuantity) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;

    }
}
