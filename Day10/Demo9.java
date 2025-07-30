// Reversing the array
package Day10;
import java.util.*;

public class Demo9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();  
       int[]array = new int[size];
       for(int i=0;i<size;i++){
        array[i] = sc.nextInt();
       }
       for(int i=size-1;i>=0;i--){
        System.out.print(array[i]+" ");
       }
    }
   
    
}
