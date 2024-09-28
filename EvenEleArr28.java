import java.util.Scanner;

public class EvenEleArr28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of element: ");
        n= sc.nextInt();
        
        int a[]=new int[n];
        int e[]=new int[n];
        int count = 0;

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                e[count]=a[i];
                count++;
            }
        }

        System.out.println("Even elements in empty array are :");
        for (int i = 0; i < count; i++) {
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }
}