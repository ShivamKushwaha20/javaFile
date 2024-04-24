import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = scanner.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = scanner.nextDouble();
        scanner.close();
    }

    public void output() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
    }

    public double calcArea() {
        return length * breadth;
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.output();
        double area = rectangle.calcArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
