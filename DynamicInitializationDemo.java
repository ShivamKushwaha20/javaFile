import java.util.Scanner;

public class DynamicInitializationDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter values for dynamic initialization
        System.out.print("Enter the value for variable x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value for variable y: ");
        int y = scanner.nextInt();

        // Calculate the sum and product using dynamic initialization
        int sum = x + y;
        int product = x * y;

        // Display the results
        System.out.println("Sum of " + x + " and " + y + " is: " + sum);
        System.out.println("Product of " + x + " and " + y + " is: " + product);

        // Close the scanner
        scanner.close();
    }
}
