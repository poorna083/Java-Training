//basic Encapsulation 
package Day17;
import java.util.*;
class car{
    String car;
    int model;
    void display(){
        System.out.println("Brand :"+car);
        System.out.println("model:"+model);

    }
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c1 = new car();
        System.out.println("Eneter the car name:");
        c1. car = sc.nextLine();
        System.out.println("Enter the Car model:");
        c1.model = sc.nextInt();
        c1.display();
    }
}
