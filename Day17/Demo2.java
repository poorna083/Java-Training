//Single Inheritancee
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
class ElectricCar extends car{
    int BatteryCapacity;
    void ElectricDisplay(){
        display();
        System.out.println("BatteryCapacity: "+BatteryCapacity);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElectricCar e1 = new ElectricCar();
        System.out.println("Eneter the car name:");
        e1. car = sc.nextLine();
        System.out.println("Enter the Car model:");
        e1.model = sc.nextInt();
        System.out.println("Enter the Car battery:");
        e1.BatteryCapacity = sc.nextInt();
        e1.ElectricDisplay();
    }
}
