/*Description
In a bank, customers only interact with simple services like depositing money, withdrawing money, and checking balance. They don’t need to know the internal process of how the bank stores the money, updates databases, or manages transactions.
Initial Balance is 5000

Here, abstraction is used. The bank provides an abstract class Bank with abstract methods like deposit(), withdraw(), and checkBalance(). Different banks like SBI or HDFC implement these methods in their own way, but for the customer, the interface remains the same.

This hides the complex implementation details from the user and only shows the essential functionalities.

Input Format
First line: Bank name (e.g., SBI)
Second line: Operation (e.g., deposit or withdraw)
Third line: Amount

Output Format
Display the result of the operation with the updated balance.

Test Case 1
Input:
deposit
2000

Output:
Deposited: 2000
Current Balance: 7000

Test Case 2
Input:
withdraw
6000


Output:

Insufficient Balance
Current Balance: 5000 */
package Day21;
import java.util.*;
import java.util.Scanner;

abstract class Bank {
    abstract boolean deposit(int amount);
    abstract boolean withdraw(int amount);
    abstract int checkBalance();
    int balance = 5000;
}

class SBI extends Bank {
    int SBIamount = balance;
    boolean deposit(int amount) {
        if (amount >= 0) {
            SBIamount += amount;
            return true;
        }
        return false;
    }
    boolean withdraw(int amount) {
        if (amount <= SBIamount) {
            SBIamount -= amount;
            return true;
        }
        return false;
    }
    int checkBalance() {
        return SBIamount;
    }
}
class HDFC extends Bank {
    int HDFCamount = balance;

    boolean deposit(int amount) {
        if (amount >= 0) {
            HDFCamount += amount;
            return true;
        }
        return false;
    }

    boolean withdraw(int amount) {
        if (amount <= HDFCamount) {
            HDFCamount -= amount;
            return true;
        }
        return false;
    }

    int checkBalance() {
        return HDFCamount;
    }

}

public class Demo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the bank name(SBI or HDFC): ");
        String bank = sc.nextLine().toLowerCase();
        System.out.print("Enter the operation(deposit or withdraw): ");
        String ops = sc.nextLine().toLowerCase();
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        Bank bankObj;
        switch (bank) {
            case "sbi":
                bankObj = new SBI();
                break;
            case "hdfc":
                bankObj = new HDFC();
                break;
            default:
                bankObj = null;
                sc.close();
                return;
        }
        boolean operation = false;
        switch (ops) {
            case "deposit":
                operation = bankObj.deposit(amount);
                if (operation)
                    System.out.println("Deposited: " + amount);
                else
                    System.out.println("Amount cannot be negative");
                break;
            case "withdraw":
                operation = bankObj.withdraw(amount);
                if (operation)
                    System.out.println("Withdrawn: " + amount);
                else
                    System.out.println("Insufficient balance");
                break;
            default:
                break;
        }
        System.out.println("Current balance: " + bankObj.checkBalance());
        sc.close();
    }
}