import java.util.HashMap;
import java.util.Collection;
import java.util.Set;
import java.util.Map.Entry;

public class EntrySetEx{
    public static void main(String[] args){
        HashMap<String,String> myDetails=new HashMap<String,String>();
        myDetails.put("FirstName","Sonam");
        myDetails.put("LastName","Chikara");
        myDetails.put("Phone Number","986754321");
        myDetails.put("Password","##421");
        myDetails.put("DOB","29 dec,2002");
        myDetails.put("Gender","Female");

        Set<Entry<String,String>> entrys = myDetails.entrySet();
        // System.out.println(keys);
        //using for each loop
        for(Entry<String,String> entry: entrys){
            // System.out.println(entry);
            // System.out.println(entry.getKey());
            // System.out.println(entry.getValue());
            String setValue = entry.setValue("xyz");
        }
        System.out.println(myDetails);
    }
}