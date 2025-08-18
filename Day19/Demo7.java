package Day19;
import java.util.*;
 class Animal {
    void sound(){
        System.out.println("Animal makes Sound");
    }   
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dod Barks");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat sound");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion Roars");
    }
}
public class Demo7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Animal a=null;
    String j = sc.nextLine();
    if (j.equalsIgnoreCase("Cat")) {
        a = new Cat();
    }
    else if(j.equalsIgnoreCase("Dog")){
        a = new Dog(); }
    else if(j.equalsIgnoreCase("lion")){
        a = new Lion();
    }
    else{
        System.out.println("Invalid Animal name..");
    }
     if(j!=null){
        a.sound();
    }
    }
}
   
