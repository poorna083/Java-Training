//Polymorphism (Method Overloading)

package Day19;
import java.util.*;
class Calculator{
public int add(int a,int b){
    return a+b;
}
public int add(int a,int b,int c){
    return a+b+c;
}
}
public class Demo4 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 10));
        System.out.println(c.add(5, 10, 15));

    }
}
