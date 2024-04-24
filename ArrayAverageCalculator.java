import java.util.Scanner;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the values
        double[] array = new double[n];

        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextDouble();
        }

        // Calculate the sum of the elements in the array
        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        // Calculate the average
        double average = sum / n;

        // Display the result
        System.out.println("The average of the elements in the array is: " + average);

        // Close the scanner
        scanner.close();
    }
}
