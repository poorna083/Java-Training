// Multiple Inheritance:
// interface and implements are the key words used in it..    
// the interface it doesn't hold the body..


import java.util.*;
 interface father {
// Abstract method
    
} 
 interface Mother {
// Abstract method
    
} 
class child implements father,Mother{
    void fatherprop(){
        System.out.println("Father Property");
    }
    void Motherprop(){
        System.out.println("Mother property");
    }
    void childprop(){
        System.out.println("Mother property");
    }
}

public class Demo77 {
    public static void main(String[] args) {
        child c = new child();
        c.fatherprop();
        c.Motherprop();
        c.childprop();
    }
}
