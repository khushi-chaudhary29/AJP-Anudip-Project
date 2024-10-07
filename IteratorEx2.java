import java.util.*;

public class IteratorEx2{
    public static void main(String[] args){
        ArrayList<String> a1=new ArrayList<String>();
  
        a1.add("Rahul");
        a1.add("Kavita");
        a1.add("Khushi");
        a1.add("Kajal");
        a1.add("Neetu");
     
        // Iterator<String> it=a1.iterator();
        ListIterator<String> it=a1.listIterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();
        while(it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }
        
    } 
}