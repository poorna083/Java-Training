//sum of the array by witout adding the minimum and maximum value
package Day13;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] array = new int[a];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int sum =0;
        Arrays.sort(array);
        array[0]=0;
        array[a-1]=0;
        for(int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
         System.out.print(sum);
    }
}


