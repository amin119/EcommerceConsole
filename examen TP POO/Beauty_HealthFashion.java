public class Beauty_HealthFashion extends Product {
    public Beauty_HealthFashion(){
        super();
    }
    public Beauty_HealthFashion(int id,String name, double price,double quantity){
        super(id,name, price, quantity);
    }
    public void printDetail(){
        System.out.println("Beauty, health and Fashion Products : \n");
    }
}
