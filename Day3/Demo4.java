//sitch statment programmmmm


import java.io.*;
import java.util.Scanner;
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
            System.out.println("Monday");
                break;
            case 2:
            System.out.println("Tuesday");
                break;
             case 3:
            System.out.println("Wednesday");
                break;
            case 4:
            System.out.println("Thursday");
                break;
            case 5:
            System.out.println("Friday");
                break;
            case 6:
            System.out.println("Saturday");
                break;
            default:
            System.out.println("Sunday");
                break;
        }

        
    }

}
