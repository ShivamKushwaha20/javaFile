import java.util.Scanner;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Define a label for the outer loop
        outerLoop: while (true) {
            System.out.print("Enter a positive number (or 0 to skip this iteration and continue): ");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("Skipping this iteration.");
                continue outerLoop; // Skip this iteration and continue with the next iteration of the outer loop
            }

            System.out.println("You entered: " + number);
            System.out.print("Do you want to continue? (yes/no): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("yes")) {
                System.out.println("Exiting the program.");
                break outerLoop; // Exit the outer loop
            }
        }

        // Close the scanner
        scanner.close();
    }
}
