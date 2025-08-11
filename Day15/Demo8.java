//Treeset and operations
package Day15;
import java.util.*;
public class Demo8 {
    public static void main(String[] args) {
        TreeSet<Integer>ts = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Eneter the elements:");
        for(int i=0;i<a;i++){
            int ts1 = sc.nextInt();
            ts.add(ts1);
        }
        System.out.println("Enter the element to add:");
        int j = sc.nextInt();
        ts.add(j);
        System.out.println(ts);
        System.out.println("Enter the element to remove:");
        int k = sc.nextInt();
        ts.remove(k);
        System.out.println(ts);
        ts.first();
        System.out.println(ts.first());
        System.out.println(ts.getFirst());
        System.out.println(ts.getLast());
        System.out.println("Enter the element than higher:");
        int l = sc.nextInt();
        System.out.println(ts.higher(l));
        System.out.println("Enter the element than lower:");
        int m = sc.nextInt();
        System.out.println(ts.higher(m));
    }
}
