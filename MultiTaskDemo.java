import java.util.Scanner;

class Demo1 implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition Started..");
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int c = a+b;
        System.out.println("Addition is: "+c);
        System.out.println("Addition completed...");
    }
}
class Demo2 implements Runnable{
    public void run(){
        System.out.println("Number printing task started...");
            for(int i = 0;i<=5;i++){
                System.out.println(i);
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("Number printing task completed...");
    }
}

public class MultiTaskDemo{
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo2 d2=new Demo2();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d2);
        t1.start();
        t2.start();
    }
}

//to achive multi threading class which is better option implements or runnable interface