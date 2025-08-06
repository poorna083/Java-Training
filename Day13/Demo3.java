//code for finding the next perfect square
package Day13;
import java.util.*;
public class Demo3 
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a<0 || a%Math.sqrt(a)!=0)  //(a)^(1/2)
    {
        System.out.println("-1");
    }
    else{
        int n = (int)Math.sqrt(a)+1;
        int b = n*n;
        System.out.println(b);
    }

}


}
