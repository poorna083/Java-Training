//Hashset in collections
package Day15;
import java.util.*;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> names= new HashSet<String>();
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            names.add(name);
        }
        names.add("hello");
        System.out.println(names);
        names.remove("hello");
        System.out.println(names);
        System.out.println(names.isEmpty());

        
        

    }
}
