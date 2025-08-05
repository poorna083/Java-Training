//sum of array elements by using functions
package Day12;
import java.util.*;
public class Demo7{
    public void main(int[]array){
        int sum =0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int size = sc.nextInt();
          int [] array = new int[size];
         for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
         }
         Demo7 D7=new Demo7();
        D7.main(array);
    }
   
}
