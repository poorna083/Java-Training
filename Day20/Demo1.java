/*Description :
Every employee has an Employee ID which is public, so it can be accessed directly.
The Salary of the employee is kept private to ensure confidentiality.
A setter method is used to assign salary with proper validation (e.g., no negative salary).
A getter method is provided to securely view the salary when needed.
This way, anyone can see the Employee ID, but salary details are still protected.
Hence, encapsulation ensures that only controlled access to sensitive data (like salary) is allowed.

Input Format
First line → Employee ID (public, directly stored).
Second line → Employee Name (set using setter).
Third line → Employee Salary (set using setter with validation).

Output Format
Print Employee ID directly (since it is public).
Print Employee Name using getter.
Print Employee Salary using getter.

Input-1
101
Binfon
45000

Output-1
Employee ID: 101
Employee Name: Binfon
Employee Salary: 45000.0


Input-2
102
Vamsi
-30000

Output-2
Employee ID: 102
Employee Name: Vamsi
Invalid Salary! (must be positive)
Employee Salary: 0.0 */
package Day20;
import java.util.*;
class Employee{
    int EmployeeID;
    private String Name;
    private Float Salary;
    public String GetName(){
        return Name;
    }
    void SetName(String Name){
        this.Name = Name;
    }
    public Float GetSalary(){
        return Salary;
    }
    public void SetSalary(Float Salary){
        this.Salary = Salary;
        
    }
}
public class Demo1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Employee ID:");
    int ID = sc.nextInt();
    while (ID<0) {
        System.out.println("Enter the Valid Emoloyee ID:");
        ID = sc.nextInt();
    }sc.nextLine();
    System.out.println("Enter the name of The Employee:");
    String name = sc.nextLine();
    System.out.println("Enter The Salary:");
    Float Salary = sc.nextFloat();
    
    while (Salary<0) {
        System.out.println("Invalid Salary!  (Must Be Positive)");
        Salary = sc.nextFloat();
    }
        Employee e = new Employee();
        e.SetName(name);
        e.SetSalary(Salary);
        System.out.println("Employee ID:"+"  "+ID);
        System.out.println("Employee Name:"+"  "+e.GetName());
        System.out.println("Employee Salary:"+"  "+e.GetSalary());
   } 
}
