import java.util.HashMap;
import java.util.Map;

public class AdminManager {
    private Map<Integer,Admin> admin_list;
    public AdminManager(){
        this.admin_list=new HashMap<>();
    }
    public void addAdmin(int id, Admin admin){
        if(!admin_list.containsKey(id)){
            admin_list.put(id,admin);
        }
    }

}
