//Hybrid Interface 
package Day21;
import java.util.*;

import Day22.Car;
import Day22.Tesla;
class Car{
    void car(){
        System.out.println("Car");
    }
}
class Tesla extends Car{
    void Tesla(){
        System.out.println("Tesla is a Car");
    }
}
class Audi extends Car{
    void Audi(){
        System.out.println("Audi is a Car");
    }
}
interface A{
    void feature();
}
interface B{
    void feature();
}
class C extends Tesla implements A,B{
    public void feature(){
        System.out.println("Helloo..");
    }
}
public class Demo5 {
    public static void main(String[] args) {
        C a = new C();
        a.car();
        a.feature();  
        a.Tesla();
          
    }
}
