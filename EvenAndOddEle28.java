import java.util.Scanner;

public class EvenAndOddEle28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of element: ");
        n= sc.nextInt();
        
        int a[]=new int[n];

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Even Numbers are: ");
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
        System.out.println("Odd Numbers are: ");
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                System.out.println(a[i]);
            }
        }
    }
}