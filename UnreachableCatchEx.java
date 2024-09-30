import java.util.Scanner;

public class UnreachableCatchEx{
    public static void main(String[] args){
        int a[]={3,6,0,1,2};
        // Scanner sc= new Scanner(System.in);
        try{
            a[5]=a[0]/a[3];
        }
         
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        //exception class is the parent class of ArrayIndexOutOfBoundsException and it should be written after their child class 
        // catch(Exception e){
        //     e.printStackTrace();
        // }
       finally{
        System.out.println("I am going to occur alwayss...");
       }
    }
}