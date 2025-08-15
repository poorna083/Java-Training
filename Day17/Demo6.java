package Day17;
import java.util.*;
class person{
    private String name;
    private int age;
    private String profession;
    person(String name,int age,String profession){
        name = "peter";
        age = 12;
        profession = "Student";

    }
    public void set(String name){
        this.name = name;
    }
    public String get(){
        return name;
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person p = new person(null, 0, null);
        System.out.println("Enter the name:");
        String i = sc.nextLine();
        p.set(i);
        System.out.println("hello"+ " "+p.get());
        
    }
}
