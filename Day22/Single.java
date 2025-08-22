// Parent Class (Super Class)
class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

// Child Class (Sub Class)
class Car extends Vehicle {
    void speed() {
        System.out.println("Car is moving at 120 km/h");
    }
}

// Main Class
public class Single {
    public static void main(String[] args) {
        // Object creation for child class
        Car c = new Car();

        // Child class method
        c.speed();

        // Parent class method (inherited)
        c.run();
    }
}