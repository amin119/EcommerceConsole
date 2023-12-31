import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShoppingCart {
    private Map<Integer,Product> shopping_cart;
    public ShoppingCart(){
        shopping_cart= new HashMap<>();
    }
    public Map<Integer,Product> getShoppingCart(){
        return shopping_cart;
    }
    public void addProduct(int id,double quantity,Inventory stock){
        if(! shopping_cart.containsKey(id)){
            Product product = stock.getProductsList().get(id);
            product.setQuantity(quantity);
            product.setPrice(quantity*product.getPrice());
            shopping_cart.put(id,product);
            System.out.println("This product has been added to the shopping cart sucessfully !");
        }else{
            System.out.println("This product already exists in this shopping cart! if you want to update the quantity press 2");
        }
    }
    public void updateProductQuantity(int id,double quantity,Inventory stock){
        if(shopping_cart.containsKey(id)){
            Product product=stock.getProductsList().get(id);
            product.setQuantity(quantity);
            product.setPrice(quantity*product.getPrice());
            shopping_cart.put(id,product);
            System.out.println("quantity has been updated succesfully !");
        }else{
            System.out.println("This product does not exists in this shopping cart! you need to add it");
        }
    }
    public void displayShoppingCart(){
        System.out.println("-----Shopping cart contains------");
        for(Map.Entry<Integer,Product> item : shopping_cart.entrySet()){
            Product product=item.getValue();
            System.out.println("Product ID : "+product.getId());
            System.out.println("Name : "+product.getName());
            System.out.println("Quantity : "+product.getQuantity());
            System.out.println("Price : "+product.getPrice());
            System.out.println("______________________");
        }
    }
    public void removeProduct(int id){
        if (shopping_cart.containsKey(id)){
            shopping_cart.remove(id);
            System.out.println("This product has been removed from the shopping cart sucessfully");
        }else{
            System.out.println("Invalid ID ! please recheck your ID and try again ");
        }
    }
    public void applyDiscount(int productId, Discount discount) {
        if (shopping_cart.containsKey(productId)) {
            System.out.println("Discount applied to the product successfully!");
        } else {
            System.out.println("Product not found in the shopping cart!");
        }
    }

}
