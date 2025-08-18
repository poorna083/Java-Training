/*Usecase
The parent class Car had a method called race(), which simply said "Car is racing" 🚗.
Different car companies joined the race with their own unique racing styles.
A Ferrari  overrode the race() method to say "Ferrari races with blazing speed" 🏎.
A Lamborghini  overrode it to say "Lamborghini races with roaring power" 🔥.
A Tesla ⚡ overrode it to say "Tesla races silently with electric power" 🔋.
Even though the method name was always race(), the behavior changed at runtime.
The race announcer (like the JVM) didn’t know in advance which car’s style would appear.
When the cars came on track, the JVM decided at runtime which race() to execute.
Thus, Method Overriding allowed each car to show its own racing personality, while still following the same rule: race() .

Input Format
First line: Enter the number of cars (n).
Next n lines: Each line contains a car name (Ferrari, Lamborghini, Tesla, or Car).

Output Format
For each car entered, print its racing style using the race() method.

Test Case 1
Input:
3
Ferrari
Lamborghini
Tesla

Output:
Ferrari races with blazing speed 
Lamborghini races with roaring power 
Tesla races silently with electric power 

Test Case 2
Input:
2
Car
Ferrari

Output:
Car is racing 
Ferrari races with blazing speed */


package Day19;
import java.util.*;
class Car {
    void race(){
        System.out.println("Car is racing");
    }    
}
class Ferrari extends Car{
    void race(){
        System.out.println("Ferrari races with blazing speed");
    }
}
class Lamborghini extends Car{
    void race(){
        System.out.println("Lamborghini races with roaring power");
    }
}
class Tesla extends Car{
    void race(){
        System.out.println("Tesla races silently with electric power");
    }
}
public class Demo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars:");
        int a = sc.nextInt();
        if(a<=0) System.out.println("Invalid Data input:");
        while (a<=0) {
            System.out.println("Re-Enter the Data again:");
            a = sc.nextInt();
        }
        sc.nextLine();
        Car r = null;
        ArrayList<String> b = new ArrayList<>();
            for(int j=0;j<a;j++){
            b.add(sc.nextLine());
            }
            for(int j=0;j<a;j++){
                if (b.get(j).equalsIgnoreCase("Car")) {
                    r = new Car();
                }
                else if(b.get(j).equalsIgnoreCase("Ferrari")){
                    r = new Ferrari();
                }
                else if(b.get(j).equalsIgnoreCase("Lamborghini")){
                    r = new Lamborghini();
                }
                else if(b.get(j).equalsIgnoreCase("Tesla")){
                    r = new Tesla();
                }
                else{
                    System.out.println("Invalid input...");
                }
                if(r!=null){
                    r.race();
                }
            }
                
    }
}
