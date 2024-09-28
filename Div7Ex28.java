import java.util.Scanner;

public class Div7Ex28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        if(n%7==0){
            System.out.println(n+" is divisible by 7");
        }
    }
}