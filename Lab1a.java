import java.util.*;

class Bank{
    private double amount;

    public Bank(double amount){
        this.amount = amount;
    }
    public void withdraw(double withdrawalAmount){
        String message = (withdrawalAmount <= amount) ? "Withdrawal successful" : "Insufficient balance";
        System.out.println(message);
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }
    public void deposit(double depositAmount){
        amount += depositAmount;
        System.out.println("Deposit successful");
    }
    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }
}

public class Lab1a{
    public static void main(String[] args){
    
        Bank account=new Bank(10000);

        account.withdraw(3000);
        account.deposit(5000);

        account.displayBalance();
    }
}

// message=(a>b)true:false;