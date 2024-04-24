import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle using the formula: area = π * radius * radius
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);

        // Close the scanner
        scanner.close();
    }
}
