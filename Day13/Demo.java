//wheather the element present in the array or not
package Day13;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int element = sc.nextInt();
        boolean found = false;
        for(int i=0;i<array.length;i++)
        {
                if(array[i]==element){
                    System.out.println("element present");
                    found = true;
                    break;
                }
        } if(!found){
                System.out.println("element not present");
            }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
