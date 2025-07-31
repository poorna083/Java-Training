package Day11;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }
        int new_array[]=new int[size+1];
        System.out.print("value:");
        int value = sc.nextInt();
        System.out.print("position:");
        int pos = sc.nextInt();
        for(int i=0;i<pos;i++){
            new_array[i]=array[i];
        }
        new_array[pos]=value;
        for(int i=pos;i<size;i++){
            new_array[i+1]=array[i];
        }
        for(int i=0;i<=size+1;i++){
            System.out.print(new_array[i]);
        }
    }
}
