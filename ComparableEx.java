import java.util.Collections;
import java.util.ArrayList;

class Student implements Comparable<Student>{
    int sid;
    String sName;

    public Student(int sid, String sName){
        super();
        this.sid=sid;
        this.sName = sName;
    }
    //override
    public int compareTo(Student ob){
        //current with the provided object
        if(sid==ob.sid)
            return 0;
        else if(sid>ob.sid)
            return 1;
        else
            return -1;
    }
}


public class ComparableEx{
    public static void main(String[] args){
        ArrayList<Student> a1=new ArrayList<Student>();
        // adding student class object
        //comparing id through sort 
        a1.add(new Student(101,"Khushi"));
        a1.add(new Student(102,"Neetu"));
        a1.add(new Student(103,"Kajal"));
        a1.add(new Student(106,"Kirti"));
        Collections.sort(a1);
        for(Student s:a1){
            System.out.println(s.sid+" "+s.sName);
        }
    }
}