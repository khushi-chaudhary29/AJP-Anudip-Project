import java.util.Scanner;

public class Lab2b{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year you want to check: ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}