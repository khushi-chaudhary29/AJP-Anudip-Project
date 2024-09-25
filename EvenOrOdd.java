import java.util.*;

public class EvenOrOdd{
    public static void main(String[] args){
        int n=100;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+" is Even");
            }
            else{
                System.out.println(i+" is Odd");
            }
        }
        System.out.println("Even Numbers are: ");
        for(int i = 1; i<=n ; i++){
           if(i%2==0){
                System.out.print(i+" ");
            } 
        }
        System.out.println();
        System.out.println("Odd Numbers are: ");
        for(int i = 1; i<=n ; i++){
           if(i%2 != 0){
                System.out.print(i+" ");
            } 
        }
    }
}