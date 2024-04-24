import java.util.Scanner;

public class SumNumbersFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();

        // Split the input string into an array of strings
        String[] numbersArray = input.split(" ");

        int sum = 0;

        // Iterate through the array and parse each string to an int, then add it to the sum
        for (String numberStr : numbersArray) {
            try {
                int number = Integer.parseInt(numberStr);
                sum += number;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number format: " + numberStr);
            }
        }

        System.out.println("Sum of the numbers entered: " + sum);

        scanner.close();
    }
}
