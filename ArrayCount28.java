import java.util.Scanner;

public class ArrayCount28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of element: ");
        n= sc.nextInt();
        
        int a[]=new int[n];

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int evencount = 0;
        int oddcount = 0;
        for(int i = 0;i<n;i++){
        if(a[i]%2==0){
            evencount++;
        }
        else{
            oddcount++;
        }
        }
        System.out.println("Even numbers in the array are: "+evencount);
        System.out.println("Odd numbers in the array are: "+oddcount);
    }
}