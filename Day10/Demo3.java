//max of elements in an array
package Day10;
import java.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] array_name =new int[size];
    for(int i=0;i<size;i++){
        array_name[i] = sc.nextInt(); 
     }
     Arrays.sort(array_name);
     System.out.println(array_name[size-1]);   
    }
} 