import java.util.*;
interface Car{
    default void Carprop(){
    System.out.println("Car prperty");
    }
}
interface  Bike{
   default void Bikeprop(){
    System.out.println("Bike property");
    }
}
class Cycle implements Car,Bike{
    void Cycleprop(){
    System.out.println("Cycle property");
    }

}
    

public class Demo100 {
    public static void main(String[] args) {
        Cycle c = new Cycle();
        c.Bikeprop();
        c.Carprop();
        c.Cycleprop();
    }
}
