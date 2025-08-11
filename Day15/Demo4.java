//Vectors in collections
package Day15;

import java.util.Scanner;
import java.util.Vector;

public class Demo4 {
 public static void main(String[] args) {
    Vector<Integer>numbers = new Vector<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no.of elements");
    int a = sc.nextInt();
    System.out.println("Enter the elements");
    for(int i=0;i<a;i++){
        numbers.add(sc.nextInt());
    }System.out.println(numbers);
    
 }   
}
