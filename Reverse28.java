import java.util.Scanner;

public class Reverse28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of element: ");
        n= sc.nextInt();
        
        int a[]=new int[n];

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The reversed array is: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}