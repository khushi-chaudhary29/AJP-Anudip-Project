import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionEx3{
    public static void main(String [] args){
        ArrayList<String> a1=new ArrayList<String>();

        //concatenation
        String s1="Anudip";
        s1=s1.concat("Foundation");
        System.out.println(s1);


        a1.add("Rahul");
        a1.add("Kavita");
        a1.add("Sonam");
        a1.set(1,"Khushi");
        System.out.println(a1.isEmpty());
        System.out.println(a1);

        String s=a1.get(0);
        System.out.println(s);

        System.out.println(a1.get(1));
        //get method
        ArrayList<String> a11=new ArrayList<String>();
        a11.add("Kajal");
        a11.add("Gole");
        a11.add("Neetu");
        //use for intersection - retainall
        a1.retainAll(a11);
        System.out.println(a1);

    }
}