// Interface with a default method
interface Vehicle {
    void start();

    default void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Implementing class for Vehicle interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
}

public class DefaultMethodDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();

        car.start(); // Calls Car's start method
        car.stop(); // Calls Vehicle's default stop method
    }
}
