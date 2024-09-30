import java.util.Scanner;

public class MultipleCatchBlockEx{
    public static void main(String[] args){
        int a[]={3,6,0,1,2};
        // Scanner sc= new Scanner(System.in);
        try{
            a[5]=a[0]/a[3];
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}