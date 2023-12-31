import java.util.Scanner;

abstract class Product {
    private int id;
    private String name;
    private double price;
    private double quantity;
    private Discount discount;
    public Product(){}
    public Product(int id,String name, double price,double quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getQuantity(){
        return quantity;
    }
    public int getId(){
        return id;
    }
    public void setQuantity(double quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setProduct(){
        Scanner sc=new Scanner(System.in);
        System.out.println("name : ");
        this.name =sc.nextLine();
        System.out.println("price : ");
        this.price =sc.nextInt();
        System.out.println("quantity : ");
        this.quantity =sc.nextInt();
        System.out.println("ID : ");
        this.id=sc.nextInt();    
    }
    public String toString(){
        return "Product ID : "+getId()+"\nProduct name : "+getName()+"\nQuantity : "+ getQuantity()+"\nPrice : "+getPrice()+"\n=======================";

    }
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return discount;
    }


}
