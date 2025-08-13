//Multiple Inheritancee
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
class cycle extends ElectricCar{
    float AutoPilotVersion;
    void AutoPilotDisplay(){
        ElectricDisplay();
        System.out.printf("cycle price: "+AutoPilotVersion);

    }
}

public class Demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cycle e1 = new cycle();
        System.out.println("Eneter the car name:");
        e1. car = sc.nextLine();
        System.out.println("Enter the Car model:");
        e1.model = sc.nextInt();
        System.out.println("Enter the Car battery:");
        e1.BatteryCapacity = sc.nextInt();
        System.out.println("Enter the AutoPilotVersion:" );
        e1.AutoPilotVersion = sc.nextFloat();
        e1.AutoPilotDisplay();
    }
}
