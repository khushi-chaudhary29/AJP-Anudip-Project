import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        int sum=0;
        for(int i = 0 ; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println("Sum of N numbers are: "+sum);
    }
}