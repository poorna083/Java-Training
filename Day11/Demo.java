package Day11;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();  
       int[]array = new int[size];
       for(int i=0;i<size;i++){
        array[i] = sc.nextInt();
       }
       for(int i=0;i>size;i--){
        System.out.print(array[i]+" ");
       }
    }
   
    
}
