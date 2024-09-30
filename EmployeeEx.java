// WAP to design a employee class it should have two method one 
// is getinput and showinput here main class will be a different class. 
// Note getinput is a private method.

import java.util.Scanner;

class Employee{
    private String name;
    private int age;
    private double salary;

    private void getInput(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of employee: ");
        name = sc.nextLine();
        System.out.print("Enter employee age: ");
        age = sc.nextInt();
        System.out.print("Enter the employee salary: ");
        salary = sc.nextDouble();
    }
    public void showInput(){
        getInput();
        System.out.println("Employee details are as follows: ");
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
public class EmployeeEx{
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.showInput();
    }
}