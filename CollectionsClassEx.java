import java.util.Collections;
import java.util.ArrayList;


public class CollectionsClassEx{
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(2);
        list.add(66);
        list.add(22);
        list.add(10);
        Collections.swap(list,0,4);
        System.out.println("List After Swapping: "+list);
    }
}