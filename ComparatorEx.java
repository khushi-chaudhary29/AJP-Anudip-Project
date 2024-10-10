import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Student1{
    int id;
    String name;
    public Student1(int id,String name){
        super();
        this.id = id;
        this.name = name;
    }
    public String toString(){
        return "Student1 [id= "+ id+", name = "+name+"]";
    }
}
class CompareId implements Comparator<Student1>{
    public int compare(Student1 o1,Student1 o2){
        return o1.id-o2.id;
    }
}
class CompareName implements Comparator<Student1>{
    public int compare(Student1 o1,Student1 o2){
        return o1.name.compareTo(o2.name);
    }
}
public class ComparatorEx{
    public static void main(String[] args){
        ArrayList<Student1> a1=new ArrayList<>();
        a1.add(new Student1(1,"Khushi"));
        a1.add(new Student1(5,"Neetu"));
        a1.add(new Student1(6,"Kajal"));
        a1.add(new Student1(3,"Anu"));
        Collections.sort(a1,new CompareName());
        for(int i = 0 ; i<a1.size() ; i++){
            System.out.println(a1.get(i));
        }
        System.out.println();
        Collections.sort(a1,new CompareId());
        for(int i = 0 ; i<a1.size() ; i++){
            System.out.println(a1.get(i));
        }
    }   
}