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
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.Setname("POORNA");
        s.SetAge(20);
        System.out.println(s.Getname()+"\n"+s.GetAge());
    }
}
}