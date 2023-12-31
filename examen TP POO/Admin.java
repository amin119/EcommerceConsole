import java.util.Scanner;

public class Admin {
    private static boolean exists =false;
    private String username;
    private String password;
    public Admin (){}
    public String  getAdminUsername(){
        return username;
    }
    public String getAdminPassword(){
        return password;
    }
    public void setAdmin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        this.username = sc.next();
        System.out.println("Enter password : ");
        this.password = sc.next();
    }
    public void signIn(){
        if(exists){
            System.out.println("An admin is already exists");
        }else{
            Scanner sc =new Scanner(System.in);
            System.out.println("Admin Name: ");
            this.username=sc.nextLine();
            System.out.println("Admin Password: ");
            this.password=sc.nextLine();
            exists=true;
        
        } 
    }
    public boolean logIn (String username, String password){
        return (username.equals(this.username)&& password.equals(this.password));
    }
    public void adminMenu() {
        System.out.println("------Admin Menu-------");
        System.out.println("1. Add Product");
        System.out.println("2. Remove Product");
        System.out.println("3. Update Product");
        System.out.println("4. Display All Products");
        System.out.println("5. Logout");

    }
}