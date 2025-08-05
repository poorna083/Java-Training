//sum of array elements by using functions
package Day12;
import java.util.*;
public class Demo7 
{
    public static int add (int size,int array[])
    {  
        int sum =0;
        for(int i=0;i<array.length;i++){
             sum = sum+array[i];
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        int sum =0;
         for(int i=0;i<array.length;i++)
        {
            array[i]= sc.nextInt();
        }
       int var add(size,array);
       System.out.println(var);
        

    }
}
