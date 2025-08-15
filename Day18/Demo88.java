//Multiple Inhetirance by using Abstract defining it in main...

interface  Father{
    abstract void Fatherprop();
}
interface mother{
    abstract void Motherprop();
}
class Child implements Father,mother{
    public void Fatherprop(){
        System.out.println("Father Property");
    }
    public void Motherprop(){
        System.out.println("Mother Property");
    }
    public void childprop(){
        System.out.println("Child property");
    }
}
public class Demo88 {
    public static void main(String[] args) {
        Child c = new Child();
        c.Motherprop();
        c.Fatherprop();
        c.childprop();
    }
}
