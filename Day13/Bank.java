package Day13;
import java.util.*;

public class Bank {
    private int balance = 1000; 

    public void method(int k, Scanner sc) {
        switch (k) {
            case 1:
                System.out.print("Enter your Deposit amount: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("Amount deposited successfully! Current balance: " + balance);
                break;

            case 2:
                System.out.print("Enter the amount to withdraw: ");
                int withdraw = sc.nextInt();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Amount withdrawn successfully! Current balance: " + balance);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 3:
                System.out.println("Current Balance is: " + balance);
                break;

            case 4:
                System.out.println("Thank you for using the Bank application!");
                break;

            default:
                System.out.println("Invalid input. Please re-enter.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to Simple Bank!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter account number: ");
        int acc_no = sc.nextInt();
         int choice = sc.nextInt();
        System.out.println("Account created successfully!");
            System.out.println("\n=========MENU=========");
            System.out.println("1. Deposit\n2. Withdraw\n3. Check Balance\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            bank.method(choice, sc);


        sc.close();
    }
}
