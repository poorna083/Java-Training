//Iterator program by using Hashcode
package Day15;
import java.util.*;
public class Demo10 {
    public static void main(String[] args) {
        HashSet<Integer> elements= new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int size = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Elements:");
        for(int i=0;i<size;i++){
            elements.add(sc.nextInt());
        }
        Iterator<Integer> i = elements.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
