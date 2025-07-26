import java.*;
import java.util.Scanner;
public class Demo9 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        //int c = (b+13);
        //int d = c+(2*13);

        for(int i=1;i<a;i++){
            System.out.println(b);
            b+=(13*i);
        }
    }    
}
