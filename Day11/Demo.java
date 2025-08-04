//wheather the element present in the array or not
package Day13;
import java.util.*;
public class Demo 
{
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int []array = new int[size];
//         for(int i=0;i<size;i++)
//         {
//             array[i]=sc.nextInt();
//         }
//         Arrays.sort(array);
//             System.out.println(array[size-1]);
        
//     }
// }
//the anoyher method

public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []array = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        int element = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>element){
                element=array[i];
            }
        }System.out.println(element);
        

    }
}