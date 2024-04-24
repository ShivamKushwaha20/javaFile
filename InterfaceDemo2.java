// Interface with a method and a data member
interface Vehicle {
    void start();

    default void displayType() {
        System.out.println("Vehicle type: " + getType());
    }

    String getType(); // Abstract method
}

// Another interface with a method and the same data member as Vehicle
interface Engine {
    void accelerate();

    default void displayType() {
        System.out.println("Engine type: " + getType());
    }

    String getType(); // Abstract method
}

// Class implementing both Vehicle and Engine interfaces
class Car implements Vehicle, Engine {
    private String type;

    // Constructor to initialize type
    public Car(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating...");
    }

    @Override
    public String getType() {
        return type;
    }

    // Override the default displayType method to resolve the ambiguity
    @Override
    public void displayType() {
        System.out.println("Car type: " + getType());
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        // Create an object of Car
        Car car = new Car("Sedan");

        // Call methods on the Car object
        car.start();
        car.accelerate();
        car.displayType(); // Resolves ambiguity by overriding the default method
    }
}
