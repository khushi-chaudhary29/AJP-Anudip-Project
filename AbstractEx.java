abstract class Abst{
    void show(){
        System.out.println("Non-Abstract Method");
    }
    abstract void show1();
}
abstract class Abst1 extends Abst{
    
}
class Abst2 extends Abst1{
    void show1(){
        System.out.println("Abstract Method");
    }
}
public class AbstractEx{
    public static void main(String[] args){
        Abst2 ab=new Abst2();
        ab.show();
        ab.show1();
    }
}