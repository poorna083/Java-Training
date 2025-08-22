package Day22;
// Parent Class
class Vehicle {
    void fuelType() {
        System.out.println("Fuel type is Petrol/Diesel/Electric");
    }
}

// Child Class 1 (Hierarchical inheritance)
class Car extends Vehicle {
    void carType() {
        System.out.println("Car type: Audi");
    }
}

// Child Class 2 (Hierarchical inheritance)
class Bike extends Vehicle {
    void bikeType() {
        System.out.println("Bike type: Sports");
    }
}

// Interface 1
interface Electric {
    void batteryCapacity();
}

// Interface 2
interface SmartFeatures {
    void autoDrive();
}

// Hybrid inheritance: combining class + multiple interfaces
class Tesla extends Car implements Electric, SmartFeatures {
    public void batteryCapacity() {
        System.out.println("Battery Capacity: 100 kWh");
    }

    public void autoDrive() {
        System.out.println("Auto-drive enabled");
    }
}

// Main
public class hybrid {
    public static void main(String[] args) {
        Tesla t = new Tesla();
        t.fuelType();        // from Vehicle
        t.carType();         // from Car
        t.batteryCapacity(); // from Electric
        t.autoDrive();       // from SmartFeatures
    }
}