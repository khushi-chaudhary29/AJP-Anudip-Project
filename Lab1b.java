import java.util.Scanner;

public class Lab1b{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt(); 

        int message = (num1 > num2)?num1:num2;
        System.out.println("The greater number is : "+message);
    }
}