import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionEx4{
    public static void main(String [] args){
        ArrayList<String> a1=new ArrayList<String>();

        System.out.println(a1.isEmpty());
        a1.add("Khushi");
        a1.add("Chaudhary");
        a1.add("neetu");
        System.out.println(a1.contains("Khushi"));
        //only element
        System.out.println(a1.size());
        ArrayList<String> a11=new ArrayList<String>();
        a11.add("Rahul");
        a11.add("Neha");
        a11.add("rita");
        System.out.println(a1.containsAll(a11));
        //it will take collection
        System.out.println(a1.indexOf("Neha"));

    }
}