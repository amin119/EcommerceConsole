public class ComputerScience extends Product{
    public ComputerScience(){
        super();
    }
    public ComputerScience(int id,String name,double price,double quantity){
        super(id,name, price,quantity);
    }
    public void printDetail(){
        System.out.println("Clothing Products : \n");
    }
    
}
