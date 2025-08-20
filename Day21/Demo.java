// Abstraction method with no body but implemented by Child Classes.
// Normal Method With body which defines inside Abstraction Class.


package Day21;
import java.util.*;
abstract class Animal{
    void sound(){
        // In abstract lass there Should be normal method or Abstract method but no body Should present.
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow Meow");
    }
}
public class Demo {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        Animal a2 = new Cat();
        a2.sound();

    }
}
