import java.util.*;
public class Demo4
 {
    public static void main(String[] args)
    {
    int a =new Scanner(System.in).nextInt();   //a=145
    int c=0;                                
    while(a>0)
    {
        int s=a%10;                            // s=145%10 s=5
        int k=1;                          
        for(int i=1;i<=s;i++)           // 1 to 5
        { 
         k=k*i;         // k=1*1 k=1 , k=1*2 k=2, k=2*3 k=6
        }
        c=c+k;
        a=a/10;
    }    
    System.out.println(c);

    }
}
