import java.util.*;
public class Demo2 
{
    public static void main(String[] args) 
    {
        Scanner sc  = new Scanner(System.in);
        long a = sc.nextLong();
        a = Math.abs(a);
        while (!(a%4==0 ||a%100==0 && a%400==0))
        {
           a++;
        }
        System.out.println(a);
         
        
    }
}
