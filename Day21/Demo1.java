package Day21;
import java.util.*;
abstract class Animal{
    void eat(){
        System.out.println("Eating..");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog Barking..");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow Meow");
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
        Animal b = new Cat();
        b.sound();
        b.eat();
        
    }
}
