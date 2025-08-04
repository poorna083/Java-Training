//the insertion of an element in an array
package Day13;
import java.util.*;;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size = sc.nextInt();
        System.out.println("enter the position");
        int pos = sc.nextInt();
        System.out.println("Enter the arrayy:");
        int[]array = new int[size];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
            System.out.println("enter the value");
            int value = sc.nextInt();
        int new_array[]=new int[size+1];
        for(int i=0;i<pos;i++){
            new_array[i]=array[i];
        }
        new_array[pos]=value;
        for(int i=pos;i<array.length;i++){
            new_array[i+1]=array[i];
        }
        for(int i=0;i<array.length+1;i++){
        System.out.println(new_array[i]);
        }
        
    }
}
