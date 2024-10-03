import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class CollectionTraverse{
    public static void main(String [] args){
        ArrayList<String> a1=new ArrayList<String>();

        System.out.println(a1.isEmpty());
        a1.add("Khushi");
        a1.add("Chaudhary");
        a1.add("Neetu");
        a1.add("Kajal");
        //traverse using for loop   
        //foreach loop mainly in collection 
        for(String a:a1){
            System.out.println(a+" ");
        }
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i) + " ");
        }
    }
}