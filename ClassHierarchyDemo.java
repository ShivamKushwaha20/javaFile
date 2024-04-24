// Base class (parent class)
class Vehicle {
    void start() {
        System.out.println("Vehicle starting...");
    }

    void stop() {
        System.out.println("Vehicle stopping...");
    }
}

// Subclass (child class) inheriting from Vehicle
class Car extends Vehicle {
    void accelerate() {
        System.out.println("Car accelerating...");
    }

    void brake() {
        System.out.println("Car braking...");
    }
}

// Subclass (child class) inheriting from Vehicle
class Motorcycle extends Vehicle {
    void kickStart() {
        System.out.println("Motorcycle kick-starting...");
    }
}

public class ClassHierarchyDemo {
    public static void main(String[] args) {
        // Create objects of the subclasses
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        // Call methods from the base class and subclasses
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();

        System.out.println();

        myMotorcycle.start();
        myMotorcycle.kickStart();
        myMotorcycle.stop();
    }
}
