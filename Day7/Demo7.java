import java.*;
import java.util.Scanner;
public class Demo7 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =1;
        for(int i = 0;i<=a;i++)
        {
            for(int j =0;j<=a;j++)
            {
                if((i+j)<=a+1){
                System.out.printf("%02d ",b++);
                System.out.print("");
                } 
            }System.out.println();
        }

    }
}
