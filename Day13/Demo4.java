//Rotate array as left or right
package Day13;
import java.util.*;
public class Demo4 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.print("Enter rotation direction (L for Left / R for Right): ");
        char rot = sc.next().toUpperCase().charAt(0);
        System.out.print("Enter number of rotations: ");
        int no_rot = sc.nextInt();
        no_rot = no_rot % size; 
        int new_array[] = new int[size];
        if (rot == 'R') {
            for (int i = 0; i < size; i++) {
                new_array[(i + no_rot) % size] = array[i];
            }
        } else if (rot == 'L') {
            for (int i = 0; i < size; i++) {
                new_array[i] = array[(i + no_rot) % size];
            }
        } else {
            System.out.println("Invalid rotation direction!");
            sc.close();
            return;
        }
        System.out.println("Rotated array: " + Arrays.toString(new_array));
        sc.close();
    }
}