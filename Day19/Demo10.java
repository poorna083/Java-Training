package Day19;
import java.util.*;
class car{
    void name(){
        System.out.println("Car name Shouldbe define");
    }
}
class Tesla extends car{
    void name(){
        System.out.println("Tesla Car");
    }
}
class Ferrari extends car{
    void name(){
        System.out.println("Ferrari car");
    }
}
class Lambo extends car{
    void name(){
        System.out.println("Lambo car");
    }
}
public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c = null;
        String j = sc.nextLine();
        if (j.equalsIgnoreCase("Car")) {
            System.out.println("Car is a meachine");
        }
        else if(j.equalsIgnoreCase("Tesla") ){
            c = new Tesla();
        }
        else if(j.equalsIgnoreCase("Ferrari")){
            c = new Ferrari(); 
        }
        else if(j.equalsIgnoreCase("Lambo")){
            c = new Lambo();
        }
        else{
            System.out.println("Invalid Input..");
        }
        if(j!=null){
        c.name();
        }
    }
}
