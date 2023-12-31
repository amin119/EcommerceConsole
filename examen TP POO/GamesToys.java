public class GamesToys extends Product {
    public GamesToys(){
        super();
    }
    public GamesToys(int id,String name,double price,double quantity){
        super(id,name, price,quantity);
    }
    public void printDetail(){
        System.out.println("Games and toys Products : \n");
    }
}
