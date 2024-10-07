import java.util.Stack;
import java.util.Iterator;

public class TraverseStackEx{
    public static void main(String[] args){
        Stack<String> s=new Stack<>();
        s.push("Dog");
        s.push("Cat");
        s.push("Bear");
        s.push("Horse");
        s.push("Monkey");
        //using for loop
        for(String animal: s){
            System.out.println(animal);
        }
        //using iterator
        System.out.println("Traversing using Iterator: ");
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}