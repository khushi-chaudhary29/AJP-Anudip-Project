import java.util.Scanner;

public class Lab2a{

public static int factNum(int num){
    int fact=1;
    for (int i = 1; i <= num; i++) {
            fact *= i;
    }
    return fact;
}

public static boolean isStrongNum(int num){
    int z=num;
    int sum=0;

    while(num>0){
        int digit=num%10;
        sum= sum+factNum(digit);
        num=num/10;
    }
    return sum==z;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if (isStrongNum(number)){
            System.out.println(number + " is a Strong number.");
        }
        else{
            System.out.println(number + " is not a Strong number.");
        }

    }
}