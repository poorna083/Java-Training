//How to use the private in it use of it in main method

package Day16;
import java.util.*;
class person{
    private String name ;
    //setter
    public void set(String name){
        this.name=name;
    }
    //getter
    public String get(){
        return name;
    }
}
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        person p = new person();
        String inputname = sc.nextLine();
        p.set(inputname);
        System.out.println("Helloo  "+p.get());
    }
}
