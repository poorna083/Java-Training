/*USECASE
Grandfather Raman was a wealthy man who owned fertile agricultural land.
He worked hard all his life to grow crops and maintain the land.
When he grew old, the property was passed on to his son Suresh.
Suresh expanded the land by building a beautiful farmhouse.
He also planted fruit orchards, making the land more valuable.
Years later, Suresh handed over the property to his son Arjun.
Arjun, being tech-savvy, built a modern villa on the land.
He also installed solar panels to make the property eco-friendly.
This way, each generation added something valuable to the inheritance.
The family’s legacy continued to grow through three generations.

Test Case 1
Input:
Raman's Land
Green Farmhouse
Modern Villa with Solar Panels

Output:
Grandfather's Property: Raman's Land
Father's Addition: Green Farmhouse
Son's Addition: Modern Villa with Solar Panels

Test Case 2
Input:
Shiv's Mango Orchard
Luxury Farmhouse
Glass Villa with Wind Turbines

Output:
Grandfather's Property: Shiv's Mango Orchard
Father's Addition: Luxury Farmhouse
Son's Addition: Glass Villa with Wind Turbines */


package Day17;
import java.util.*;
class Grandfather{
    String land;
    void property(){
        System.out.println("Grandfather's Property:"+land);
    }
}
class father extends Grandfather{
    String Addition;
    void FatherAddition(){
        property();
        System.out.println("Father's Addition:"+Addition);
    }
}
class son extends father{
    String Additions;
    void SonAddition(){
        FatherAddition();
        System.out.println("Son's Addition:"+ Additions);
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        son s = new son();
        System.out.println( "Land persons name:");
        s.land = sc.nextLine();
        System.out.println("Fathers addition:");
        s.Addition = sc.nextLine();
        System.out.println("Sons Addition:");
        s.Additions = sc.nextLine();
        s.SonAddition();
    }
}
