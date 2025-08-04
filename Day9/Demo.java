//insert the element in the array 


package Day11;
import java.util.*;
public class Demo {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();  
       int[]array = new int[size];
       for(int i=0;i<size;i++)
       {
        array[i] = sc.nextInt();
       }
        int new_array[] = new int[size+1];

    for(int i=0;i<size;i++){
        new_array[i] = array[i];
    }
    int new_element = sc.nextInt();
    new_array[size]= new_element;
    for(int i=0;i<=size+1;i++){
        System.out.println(new_array[i]);
    }
   }

}   
    

