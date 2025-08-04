import java.util.*;
public class Demo1 
{
    public static void main(String[] args) 
    {
        int a = new Scanner(System.in).nextInt();
        int count = 0;
        if(a==0){
            count=1;
        }
        else{
            while(a!=0){
            a = a/10;
            count ++;
            }
            System.out.println(count);
        }
    
    }

       

    
}
