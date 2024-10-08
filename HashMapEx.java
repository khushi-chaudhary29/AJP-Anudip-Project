import java.util.HashMap;
import java.util.Collection;

public class HashMapEx{
    public static void main(String[] args){
        HashMap<String,String> myDetails=new HashMap<String,String>();
        myDetails.put("FirstName","Sonam");
        myDetails.put("LastName","Chikara");
        myDetails.put("Phone Number","986754321");
        myDetails.put("Password","##421");
        myDetails.put("DOB","29 dec,2002");
        myDetails.put("Gender","Female");

        Collection<String> values = myDetails.values();
        System.out.println(values);
        System.out.println(myDetails);
        System.out.println(myDetails.get("FirstName"));
        System.out.println(myDetails.get("Address"));
    }
}