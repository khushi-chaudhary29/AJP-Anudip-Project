import java.util.*;

class User{
    int id;
    String name;
    public User(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void displayUserInfo(){
        System.out.println("User ID: "+id);
        System.out.println("User Name: "+name);
    }
}
class Employee extends User{
    double salary;
    public Employee(int id,String name,double salary){
        super(id,name);
        this.salary=salary;
    }
    public double CalculateSal(){
        return salary*12;
    }
    public void DisplayEmpDetail(){
        displayUserInfo();
        System.out.println("Monthly Salary: "+salary);
        System.out.println("Annual Salary: "+CalculateSal());
    }
    
}

public class Lab2c{
    public static void main(String[] args){
        Employee emp = new Employee(1, "Khushi", 50000.00);
        emp.DisplayEmpDetail();
    }
}