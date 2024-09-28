import java.util.Scanner;

public class IfElseEx28{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in Maths: ");
        int math=sc.nextInt();
        System.out.println("Enter your marks in Science: ");
        int science=sc.nextInt();
        System.out.println("Enter your marks in English: ");
        int eng=sc.nextInt();
        
        int total = math + science + eng;
        double avg = total / 3.0;

        String grade;
        if( avg >= 90){
            grade = "A";
        }
        else if(avg >= 70){
            grade = "B";
        }
        else if(avg >= 50){
            grade = "C";
        }
        else{
            grade = "FAIL";
        }

        System.out.println("Total Marks are: " + total);
        System.out.println("Average Marks are: " + avg);
        System.out.println("Grade: " + grade);
    }
}