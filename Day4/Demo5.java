import java.*;
import java.util.Scanner;
public class Demo5  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=2; i<=a;i+=2){
            System.out.println(a+ "x" + i + "=" + (a*i));
        }
    }
}
