public class Telephone extends Product {
    public Telephone(){
        super();
    }
    public Telephone(int id,String name,double price,double quantity){
        super(id,name, price,quantity);
    }
    public void printDetail(){
        System.out.println("Telephone Products : \n");
    }
}
