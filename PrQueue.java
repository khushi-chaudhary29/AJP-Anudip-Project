import java.util.PriorityQueue;
import java.util.Queue;

public class PrQueue{
    public static void main(String[] args){
        Queue<Integer> q=new PriorityQueue<Integer>();
        q.add(5);
        q.add(10);
        q.add(12);
        q.add(8);
        q.add(9);
        q.add(11);
        q.add(7);
        q.add(2);
        System.out.println(q);
        //COMMONLY USED METHOD OF THE QUEUE interface are:
        //add(), offer(), element(); peek(), remove(), poll()
    }
}