package Day13;
import java.lang.classfile.instruction.SwitchCase;
import java.util.*;
public class Bankapplication {
    public void main( int k ){
        Scanner sc1 = new Scanner(System.in);
         System.out.println("=========MENU=========");
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n 4.Exit");
        System.out.println("Enter your choice:");
        switch (k) {
            case 1:
                System.out.print("Enter youe Deposit amount:");
                System.out.println("Amount deposited Successfully!");
                break;
            case 2:
                System.out.print("Enter the amount to withdraw:");
                int withdraw = sc1.nextInt();
                if(withdraw<=1000){
                System.out.println("Amount deposited Successfully!");
                break;
                }
            case 3:
                System.out.print("Current Balance is:"+1000);
                break;
            case 4:
            System.out.println("Thank you for using the Bank application");
            default:
            System.out.println("invalid input has been given.please re enter");    
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Simple Bank!");
        String name = sc.nextLine();
        System.out.print("Enter your name:");
        int acc_no = sc.nextInt();
        System.out.print("Enter account number:");
        System.out.println("Account created successfully!");
         System.out.println("=========MENU=========");
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n 4.Exit");
        System.out.println("Enter your choice:");
        int k = sc.nextInt();
        Bankapplication b = new Bankapplication();
        b.main(k);

    }

}