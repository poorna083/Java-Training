//Rotate array as left or right
package Day13;
import java.util.*;

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();
        System.out.print("Enter direction (L for Left / R for Right): ");
        char direction = sc.next().toUpperCase().charAt(0);
        k = k % size;
        if (direction == 'L') {
            rotateLeft(arr, k);
        } else if (direction == 'R') {
            rotateRight(arr, k);
        } else {
            System.out.println("Invalid direction!");
            return;
        }
        System.out.println("Rotated Array: " + Arrays.toString(arr));
        sc.close();
    }
    public static void rotateLeft(int[] arr, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }
    public static void rotateRight(int[] arr, int k) {
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
