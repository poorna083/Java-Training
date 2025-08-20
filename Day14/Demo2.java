package Day14;
import java.util.*;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        List <String> arr_list = new ArrayList<>();
        for(int i=0;i<size;i++){
            String k = sc.nextLine();
            arr_list.add(k);
        }
        arr_list.get(2);
        arr_list.set(size, null);
        arr_list.remove(3);
        arr_list.contains(10);

    }
}
