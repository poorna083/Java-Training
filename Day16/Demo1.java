package Day16;
import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String,Integer> Map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the capacity of batsman:");
        int n = sc.nextInt();
        System.out.println("Enter the batsman name and runs:");
        for(int i=0;i<n;i++){
            Map.put(sc.next(), sc.nextInt());
        }
        System.out.println("Enter the capacity of bowlers:");
        int m = sc.nextInt();
        System.out.println("Enter the bowler name and wickets:");
        for(int j=0;j<m;j++){
            Map.put(sc.next(), sc.nextInt());
        }
        System.out.println("Update data of:");
        System.out.println(Map.replace(sc.next(), sc.nextInt()));

        System.out.println("Remove Data of:");
        System.out.println(Map.remove(sc.nextLine()));
        System.out.println(Map);
        
    }
}
