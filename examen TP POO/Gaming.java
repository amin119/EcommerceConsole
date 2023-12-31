public class Gaming extends Product {
    public Gaming(){
        super();
    }
    public Gaming(int id,String name,double price, double quantity){
        super(id,name, price,quantity);
    }
    public void printDetail(){
        System.out.println("Gaming Product : \n");
    }   
}
