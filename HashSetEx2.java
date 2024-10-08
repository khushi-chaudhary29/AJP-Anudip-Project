import java.util.HashSet;
import java.util.Set;

public class HashSetEx2{
    public static void main(String[] args){
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        Set<Integer> u = new HashSet<>(set1);
        u.addAll(set2);
        System.out.println("Union of both sets are : " + u);

        Set<Integer> i = new HashSet<>(set1);
        i.retainAll(set2);
        System.out.println("Intersection of both sets are: " + i);

        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);
    }
}