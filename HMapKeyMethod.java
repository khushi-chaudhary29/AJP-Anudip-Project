import java.util.HashMap;
import java.util.Collection;
import java.util.Set;

public class HMapKeyMethod{
    public static void main(String[] args){
        HashMap<String,String> myDetails=new HashMap<String,String>();
        myDetails.put("FirstName","Sonam");
        myDetails.put("LastName","Chikara");
        myDetails.put("Phone Number","986754321");
        myDetails.put("Password","##421");
        myDetails.put("DOB","29 dec,2002");
        myDetails.put("Gender","Female");

        Set<String> keys = myDetails.keySet();
        System.out.println(keys);
        //using for each loop
        for(String key: keys){
            // System.out.println(key);
            System.out.println(key+" : "+myDetails.get(key));
        }
    }
}