//Example of an Class and Object 

package Day16;
import java.util.*;
class car{
        String brand;
        int model;
        float weight;
        void Return(){
            System.out.println("brand:" +brand);
            System.out.println("model:" +model);
            System.out.println("Weight:" +weight);
        }
}
public class Demo2 {
    public static void main(String[] args) {
        car c = new car();
        Scanner sc = new Scanner(System.in);
        c.brand=sc.nextLine();
        c.model=sc.nextInt();
        c.weight=sc.nextFloat();
        
        c.Return();
    }

}
    

        
    

