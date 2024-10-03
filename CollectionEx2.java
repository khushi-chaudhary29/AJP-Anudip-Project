import java.util.ArrayList;
import java.util.List;
import java.util.*;
//Add all method 
public class CollectionEx2{
    public static void main(String [] args){
        //we can not add number because it is genric type
        ArrayList<String> a11=new ArrayList<String>();
        a11.add("Rahul");
        a11.add("Kavita");
        a11.add("Sonam");
        System.out.println(a11);
        a11.add(1,"Khushi");//1 means first position 
        System.out.println(a11);
        a11.remove(1);
        System.out.println(a11);
        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Ravina");
        a1.add("Jiya");
        // a1.addAll(a11);
        a11.addAll(0,a1);
        System.out.println(a11);
        a11.removeAll(a1);
        System.out.println(a11);
        a11.clear();
        System.out.println(a11);
        
    }
}