package UdemyYT.Variables.objectPrograming;
import java.util.Scanner;
public class encapsulation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        BankAccount alo = new BankAccount();
        System.out.println("How much would you like to deposit: ");
        double depositAmount = input.nextDouble();
        alo.deposit(depositAmount);
        System.out.println("How much would you like to withdraw: ");
        double withdrawAmount = input.nextDouble();
        alo.withdraw(withdrawAmount);
    }
}

class BankAccount{
    private double amount;
    BankAccount(){
        amount = 0;
    }
    double getAmount(){
        return amount;
    }
    private void setAmount(double amount){
        this.amount = amount;
    }
    boolean withdraw(double amount){
        System.out.println("Your balance is: " + getAmount());
        if(amount > this.amount){
            System.out.println("Insufficient funds");
            return false;
        }
        System.out.println("Withdrawing " + amount + " from bank account");
        setAmount(this.amount - amount);
        System.out.println("Withdraw successful");
        System.out.println("Your balance is: " + getAmount());
        return true;

    }
    boolean deposit(double amount){
        System.out.println("Your balance is: " + getAmount());
        setAmount(this.amount + amount);
        System.out.println("Deposit successful. Your balance is: " + getAmount());
        return true;
    }
}
