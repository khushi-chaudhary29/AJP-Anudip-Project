import java.util.Scanner;

public class Search28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of element: ");
        n= sc.nextInt();
        
        int a[]=new int[n];

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the element to find it is in array or not : ");
        int ele = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] == ele) {
                System.out.println("Element found in the array");
                break;
            }
        }
    }
}