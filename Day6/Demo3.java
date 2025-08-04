import java.util.*;
import java.lang.*;
public class Demo3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int size = (n*2)-1;
         for(int i=0;i<(n*2)-1;i++){
            for(int j=0;j<(n*2)-1;j++)
            {
              int min=Math.min(Math.min(i,j),Math.min(size-1-i, size-1-j));
              System.out.print((n-min)+ " ");
           }System.out.println();
        }
    }
}