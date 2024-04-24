class AreaCalculator {
    // Method to calculate area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate area of a rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of a triangle
    public double calculateArea(double base, double height, String shape) {
        if (shape.equalsIgnoreCase("triangle")) {
            return 0.5 * base * height;
        } else {
            return 0; // Invalid shape
        }
    }
}

public class AreaCalculatorDemo {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Calculate area of a square
        double squareArea = calculator.calculateArea(5);
        System.out.println("Area of square: " + squareArea);

        // Calculate area of a rectangle
        double rectangleArea = calculator.calculateArea(4, 6);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate area of a triangle
        double triangleArea = calculator.calculateArea(3, 4, "triangle");
        System.out.println("Area of triangle: " + triangleArea);
    }
}
