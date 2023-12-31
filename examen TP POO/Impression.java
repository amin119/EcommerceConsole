public class Impression extends Product {
    public Impression(){
        super();
    }
    public Impression(int id,String name,double price,double quantity){
        super(id,name, price,quantity);
    }
    public void printDetail(){
        System.out.println("Impression Products : \n");
    }
}
