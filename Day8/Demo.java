//Given array as revers orderr

package Day10;
import java.util.*;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array_name [] = new int[size];
        for(int i=0;i<size;i++)
        {
            array_name[i]=sc.nextInt(); 
        }
        for(int i=size-1;i<size;i--)
        {
           System.out.println(array_name[i]+" ");
        }

    }
}
