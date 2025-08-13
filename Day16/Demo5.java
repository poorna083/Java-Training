package Day16;
import java.util.*;

class Person {
    private String name;
    private int age;
    public Person(){
        int age = 12;
        String poorna;
  
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println(p.getAge() + ":" + p.getName());

        System.out.println("Enter the age:");
        int i = sc.nextInt();
        sc.nextLine(); // clear leftover newline

        System.out.println("Enter the name:");
        String j = sc.nextLine();
        System.out.println(p.getAge() + ":" + p.getName());
        p.setAge(i);
        p.setName(j);

        // System.out.println(p.getAge() + ":" + p.getName());
    }
}
