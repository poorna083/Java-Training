package Day11;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int [] new_array = new int[size-1];
        int pos = sc.nextInt();
        System.out.println("pos:");
        for(int i=0;i<size;i++){
        if(1+i<size){
            if(i>=pos){
            new_array[i]=array[i+1];
            }
            else{
                new_array[i]=array[i];
            }

        }
        }
        for(int i=0;i<size-1;i++){
            System.out.println(new_array[i]);
        }


    }
}
