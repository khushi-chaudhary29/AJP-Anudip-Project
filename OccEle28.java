import java.util.Scanner;

public class OccEle28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the numbers of element: ");
        n= sc.nextInt();
        
        int a[]=new int[n];

        for(int i = 0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the element to find its occurrences: ");
        int ele = sc.nextInt();

        int count =0;
        for (int i = 0; i < n; i++) {
            if (a[i] == ele) {
                count++;
            }
        }
        System.out.println("The occurrence of "+ele+" in the array is : "+count);

    }
}