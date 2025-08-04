//Updating the elemnt at any position with the given position and element
package Day11;
import java.util.*;
public class Demo3 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] array = new int[size];
    for(int i=0;i<size;i++){
        array[i]=sc.nextInt();
    }
    int [] new_array = new int[size];
     System.out.println("enter the position:");
    int pos = sc.nextInt();
        System.out.println("enter the value:");
    int value = sc.nextInt();
    if(pos<0 ||pos>=size)
    {
        System.out.println("Invalid");
        return;
    }
    
    for(int i=0;i<pos;i++){
        new_array[i]=array[i];
    }
    
    for(int i=pos+1;i<size;i++){
        new_array[i]=array[i];
    }
    new_array[pos]=value;
    for(int i=0;i<size;i++){
        System.out.println(new_array[i]);
    }
 }  
}
 