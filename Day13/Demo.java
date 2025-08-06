package Day13;
//arthmatic operations by using functions

import java.util.*;
public class Demo {
    public static int method1(int a,int b){
        int resu = a+b;
        return resu;
    }
    public static int method2(int a,int b){
        int resu = a-b;
        return resu;
    }
    public static int method3(int a,int b){
        int resu = a*b;
        return resu;
    }
    public static int method4(int a,int b){
        int resu = (int)Math.pow(a, b);
        return resu;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( "addition is:"+method1(a, b));
        System.out.println( "substraction i:s"+method2(a, b));
        System.out.println(" multipl is:"+ method3(a, b));
        System.out.println( "division is:"+ method4(a, b));
    } 

}
