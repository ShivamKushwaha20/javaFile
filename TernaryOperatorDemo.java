import java.util.Scanner;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use ternary operator to check if the number is even or odd
        String result = (number % 2 == 0) ? "even" : "odd";

        // Display the result
        System.out.println("The number " + number + " is " + result + ".");

        // Close the scanner
        scanner.close();
    }
}
