import java.util.HashSet;

public class Lab6a{
    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        hs.add("grapes");
        hs.add("mango");
        hs.add("orange");

        String elementToAppend = "guava";
        hs.add(elementToAppend);
        System.out.println("Updated HashSet: "+hs);

    }
}