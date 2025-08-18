// Method OVerLoading with int and Flaot

package Day19;
import java.util.*;
class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
    return a+b+c;
    }
    public Float add(Float a,Float b){
        return a+b;
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Integer:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter the value of Float:");
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        Calculator l = new Calculator();
        System.out.println(l.add(a, b));
        System.out.println(l.add(a, b, c));
        System.out.println(l.add(a, b));
    }
}
