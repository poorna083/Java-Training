
package Day10;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr_name = new int [size];
        for(int i=0;i<size;i++){
            arr_name[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr_name[i]+" ");
        }

        
    }
    
}
