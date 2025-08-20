package Day21;
interface Animal{
    void sound(); 
    default void eat(){
        System.out.println("Eating......");
    }
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Meow Meow");
    }
}
public class Demo2
{
	public static void main(String[] args) {
		Animal a1=new Dog();
		a1.sound();
		a1.eat();
		
		Animal a2=new Cat();
		a2.sound();
		a2.eat();
	}
}