import java.util.Scanner;

public class Lab1c{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = sc.nextInt();

         System.out.print("Enter the bit position you want to check (it is index wise) it reads from right to left: ");
         int n = sc.nextInt();

         boolean isCheck = (number & (1 << n)) != 0;

         if (isCheck) {
            System.out.println("The bit is (1).");
        } else {
            System.out.println("The bit is (0).");
        }

    }
}

// 5 = 101
// 1-0
// 0-1
// 1-2

// 4=100
