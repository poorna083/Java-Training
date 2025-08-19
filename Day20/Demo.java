//Getters and Setters in java Example problem..

package Day20;
import java.util.*;
class Student{
    private String name;
    private int age;
public String Getname(){
    return name;
}
public void Setname(String name){
    this.name = name;
}
public int GetAge(){
    return age;
}
public void SetAge(int age){
    this.age = age;
}
public class Demo 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        while(age <=0){
           System.out.println("Invalid Input, Re enter positive Value"); 
           age = sc.nextInt();
        }
        Student s = new Student();
        s.Setname(name);
        s.SetAge(age);
        System.out.println(s.Getname()+"\n"+s.GetAge());
    }
}
}