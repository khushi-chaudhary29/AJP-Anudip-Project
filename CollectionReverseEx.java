import java.util.Collections;
import java.util.ArrayList;


public class CollectionsClassEx{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> li=new ArrayList<>();
        list.add(100);
        list.add(2);
        list.add(66);
        list.add(22);
        list.add(10);
        li.add("A");
        li.add("L");
        li.add("D");
        li.add("Z");
        li.add("C");
        li.add("B");

        Collections.reverse(list);
        Collections.sort(li);
        System.out.println("List After Reversing: "+list);
        System.out.println("List After Sorting String Object: "+li);
    }
}