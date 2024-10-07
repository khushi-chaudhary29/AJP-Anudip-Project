import java.util.Stack;

public class StackEx{
    public static void main(String[] args){
        Stack<String> s=new Stack<>();
        //ListIterator can also be used here 
        s.push("Dog");
        s.push("Cat");
        s.push("Bear");
        s.push("Horse");
        s.push("Monkey");
        System.out.println(s);
        String a=s.pop();
        System.out.println("Removed animal: "+a);
        System.out.println(s);
        String b = s.peek();
        System.out.println(b);
        System.out.println(s);
        int p=s.search("Cat");
        System.out.println(p);
        System.out.println(s.empty());
        
    }
}