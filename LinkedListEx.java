import java.util.LinkedList;

public class LinkedListEx{
    public static void main(String[] args){
        LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(50);
        ll.add(65);
        ll.add(34);
        ll.add(99);
        ll.add(78);
        ll.add(45);
        //it is in the form of DLL
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        
        LinkedList<Integer> newll=new LinkedList<Integer>();
        newll.add(500);
        newll.add(600);
        ll.addAll(newll);
        System.out.println(ll);
        ll.addFirst(5);
        System.out.println(ll);
        ll.addLast(900);
        System.out.println(ll);

        // ll.clear();
        // System.out.println(ll);

        boolean value=ll.contains(900);
        System.out.println(value);
        System.out.println(ll.indexOf(78));
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
        System.out.println(ll.size());

//some methods we have to use are
// addAll addfirst addlast clear contains indexof removefirst removelast peekfirst peekklast size 

    }
}