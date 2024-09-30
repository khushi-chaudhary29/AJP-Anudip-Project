import java.util.Scanner;

public class ExceptionEx{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a: ");
        a=sc.nextInt();
        System.out.println("Enter b: ");
        b=sc.nextInt();
        try{
        c=a/b;
        System.out.println("c="+c);
        }
        catch(ArithmeticException e){ 
            System.out.println("I am Arithmetic Exception "+e);
        }
        System.out.println("End of the code ....");
    }
}