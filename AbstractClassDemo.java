// Abstract class with constructor and final method
abstract class Shape {
    protected String type;

    // Constructor in abstract class
    public Shape(String type) {
        this.type = type;
    }

    // Abstract method
    public abstract double calculateArea();

    // Final method that cannot be overridden
    public final void displayType() {
        System.out.println("Shape type: " + type);
    }
}

// Concrete subclass of Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle"); // Call to superclass constructor
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Create an object of Circle
        Circle circle = new Circle(5);

        // Call methods on the Circle object
        circle.displayType(); // Calls final method from abstract class
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
    }
}
