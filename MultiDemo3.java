import java.util.Scanner;

class Demo1 extends Thread{

    public void run(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        if(name.equals("ADD")){
            add();
        }
        else{
            printNum();
        }
    }
    public void add(){
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
    public void printNum(){
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


public class MultiDemo3{
    public static void main(String[] args){
        Demo1 d1=new Demo1();
        Demo1 d2=new Demo1();
        d1.setName("ADD");
        d2.setName("NUM");
        d1.start();
        d2.start();
    }
}