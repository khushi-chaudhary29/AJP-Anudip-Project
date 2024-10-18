import java.util.ArrayList;
import java.util.Collections;

public class Lab5b {
    public static void main(String[] args) {
        ArrayList<String> strL = new ArrayList<String>();
        strL.add("apple");
        strL.add("banana");
        strL.add("cherry");
        strL.add("date");
        strL.add("elderberry");

        System.out.println("Original list: " + strL);

        Collections.reverse(strL);

        System.out.println("Reversed list: " + strL);
    }
}
