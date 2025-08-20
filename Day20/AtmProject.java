package Day20;
import java.util.*;
class ATM{
    int account_number;
    private String account_Holder_Name;
    private double deposit_Amont;
    private double Withdraw_Amount;
    private double current_Balance;
    public String Getaccount_Holder_Name(){
        return account_Holder_Name;
    }
    public void Setaccount_Holder_Name(String account_Holder_Name){
        this.account_Holder_Name = account_Holder_Name;
    }
    public double getdeposit_Amont(){
        return deposit_Amont;
    }
    public void Setdeposit_Amont(double deposit_Amont){
        this.deposit_Amont = deposit_Amont;
    }
    public double GetWithdraw_Amount(){
        return Withdraw_Amount;
    }
    public void SetWithdraw_Amount(double Withdraw_Amount){
        this.Withdraw_Amount = Withdraw_Amount;
    }
    public double Getcurrent_Balance(){
        return current_Balance;
    }
    public void Setcurrent_Balance(double current_Balance){
        this.current_Balance = current_Balance;
    }
}
public class AtmProject{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Account Number:");
        int account_number = sc.nextInt();
        while(account_number<0){
            System.out.println("Invalid Data! re-Enter Again");
            account_number = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter The Account Holder Name:");
        String account_Holder_Name = sc.nextLine();
        System.out.println("Enter the Deposit Amount:");
        double deposit_Amont = sc.nextDouble();
        while(deposit_Amont<0){
            System.out.println("Invalid Data Entered! Re-Enter Again");
            deposit_Amont = sc.nextDouble();
        }
        System.out.println("Enter The Withdrawl amount");
        double Withdraw_Amount = sc.nextDouble();
        while(Withdraw_Amount<0){
            System.out.println("Invalid Data Entered! Re-Enter Again");
            Withdraw_Amount = sc.nextDouble();
        }
        double current_Balance = (deposit_Amont);
        current_Balance -= (Withdraw_Amount);
    if (current_Balance<0) 
    {
        System.out.println("Insufficent Balance!  Withdrawl Failed");
    }
        ATM a = new ATM();
        a.Setaccount_Holder_Name(account_Holder_Name);
        a.Setdeposit_Amont(deposit_Amont);
        a.SetWithdraw_Amount(Withdraw_Amount);
        a.Setcurrent_Balance(current_Balance);
        System.out.println("Account Number: "+account_number);
        System.out.println("Account Holder: "+a.Getaccount_Holder_Name());
        System.out.println("Deposited: "+a.getdeposit_Amont());
        System.out.println("Withdrawn:"+a.GetWithdraw_Amount());
        if (current_Balance<0) 
        {
        System.out.println("Insufficent Balance!  Withdrawl Failed");
        }
        else{
            System.out.println("Current Balance"+a.Getcurrent_Balance());
        }
    }
}
