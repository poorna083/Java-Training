//person details by using multiple inheritancee

package Day17;
import java.util.*;
class person{
    String name;
    int age;
    void details(){
        System.out.println("The name is:"+name);
        System.out.println("The age is:"+age);
    }
}
class student extends person{
    int Class;
    char Section;
    void student(){
        details();
        System.out.println("Enter the class:"+Class);
        System.out.println("Enter the Section"+Section);
    }
}
class dancer extends student{
    char grade;
    int position;
    void dancer(){
        student();
        System.out.println("Enetr the grade:"+grade);
        System.out.println("Enter the position: "+position);
    }
}
public class Demo4 {
    public static void main(String[] args) {
        dancer d = new dancer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the name:");
        d. name = sc.nextLine();
        System.out.println("Enetr the age:");
        d. age = sc.nextInt();
        System.out.println("Enter the class:");
        d. Class = sc.nextInt();
        System.out.println("Enetr the Section:");
        d. Section = sc.next().charAt(0);
        System.out.println("Enter the grade:");
        d. grade = sc.next().charAt(0);
        System.out.println("Enter the position:");
        d. position = sc.nextInt();
        d.dancer();

    }
}
