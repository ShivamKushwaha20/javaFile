import java.util.Scanner;

public class  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        System.out.println("Program continues after exception handling");
        scanner.close();
    }
}
