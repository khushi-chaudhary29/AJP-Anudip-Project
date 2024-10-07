import java.util.*;

public class IteratorEx{
    public static void main(String[] args){
        // ArrayList<String> a1=new ArrayList<String>();
        ArrayList a1=new ArrayList();
        a1.add("Rahul");
        a1.add("Kavita");
        a1.add("Khushi");
        a1.add("Kajal");
        a1.add("Neetu");
        a1.add(5);
        // Iterator<String> it=a1.iterator();
        Iterator it=a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next()+" ");
        }
        
    }
}