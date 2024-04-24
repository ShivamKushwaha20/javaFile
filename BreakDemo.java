import java.util.Scanner;

public class BreakDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a positive number (or 0 to exit): ");

        while (true) {
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Exiting the program.");
                break; // Exit the loop if the number is 0
            }

            System.out.println("You entered: " + number);
            System.out.print("Enter another number (or 0 to exit): ");
        }

        // Close the scanner
        scanner.close();
    }
}
