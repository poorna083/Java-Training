package Day13;
import java.util.*;
public class calculator{
public static int add(int a,int b){
  
    return a+b;
}
public static int sub(int a,int b){
    return a-b;
}
public static int mul(int a,int b){
    return a*b;
}
public static int div(int a,int b){
    return (a/b);
}
public static int mod(int a,int b){
   
    return a%b;
}
public static int x_or(int a,int b){
    return ((a)^(b));
}
public static void main(String[]args)
 {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the value1:");
    int a = sc.nextInt();
    System.out.println("enter the value2:");
    int b = sc.nextInt();
    System.out.println("enter the operator : + - * / % ^:");
    char c = sc.next().charAt(0);
    switch (c) {
        case '+':
            System.out.println(add(a, b));
            break;
        case '-':
            System.out.println(sub(a, b));
            break;
        case '*':
            System.out.println(mul(a, b));
            break;
        case '/':
            System.out.println(div(a, b));
            break;
        case '%':
            System.out.println(mod(a, b));
            break;
        case '^':
            System.out.println(x_or(a, b));
            break;
        default:
            System.out.println("Invalid data entered by the user:");
            break;
    }
 }

}

