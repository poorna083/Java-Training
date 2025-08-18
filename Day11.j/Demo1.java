//reversing the array thar which is given as an input
package Day13;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Array size");
            int size = sc.nextInt();
            System.out.println("Array elements");
            int [] array = new int[size];
            for(int i=0;i<array.length;i++)
            {
                 array[i]= sc.nextInt();
            }
            for(int i=array.length-1;i>=0;i--){
                System.out.println(array[i]);
            }
            
        
    }
}
