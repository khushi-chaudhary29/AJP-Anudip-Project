import java.util.HashMap;
import java.util.Collection;

public class HashMapValueMethod{
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
        //using for each loop
        for(String value: values){
            System.out.println(value);
        }


    }
}