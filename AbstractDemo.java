// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract void draw();

    // Concrete method (has implementation)
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass of Shape
class Circle extends Shape {
    // Implementation of the abstract method
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Concrete subclass of Shape
class Rectangle extends Shape {
    // Implementation of the abstract method
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // Cannot create an instance of an abstract class
        // Shape shape = new Shape(); // Compilation error

        // Create instances of concrete subclasses
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call abstract method (polymorphism)
        circle.draw();
        rectangle.draw();

        // Call concrete method
        circle.display();
        rectangle.display();
    }
}
