import java.io.*;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
         long a = sc.nextLong();
        a = Math.abs(a);
        System.out.println(a);
        int count=0;
        while(a!=0){
            a = a/10;
            count++;
            

        }
        System.out.println(count);
    }

}
