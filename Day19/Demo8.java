package Day19;
import java.util.*;
class Animal{
    void sound(){
        System.out.println("Animal sound🔉🔉");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow Meow🐈");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks🐕");
    }
}
class Lion extends Animal{
    void sound(){
        System.out.println("Lion Roars🦁");
    }
}
public class Demo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        Animal l = null;
        for(int i=0;i<a;i++){
            String b = sc.nextLine();
            if(b.equalsIgnoreCase("Lion")){
                l = new Lion();
            }
            else if(b.equalsIgnoreCase("Dog")){
                l = new Dog();
            }
            else if(b.equalsIgnoreCase("cat")){
                l = new Cat();
            }
            else if(b.equalsIgnoreCase("Animal")){
                l = new Animal();
            }
            else{
                System.out.println("Invalid Input ❌");
            }
            if(l!=null){
                l.sound();
            }

        }
        
    }
}
