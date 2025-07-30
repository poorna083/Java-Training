package Day10;
import java.util.*;
public class Demo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<i;j++){
                		       
		         if(array[i]==array[j]){
		            count++;
		        }

            }
        }System.out.println(size-count);
    }
}
