import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args)
     {
        int x = new Scanner(System.in).nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a+" ");
            //for(int i=0;i<=x;i++)
            while(x>0)
            {
            int temp = a+b;
             b = temp;
             a = b;
             System.out.println(a+" ");
             x--;
            }
            
        }
        
}
