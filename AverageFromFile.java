import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AverageFromFile {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "values.txt";

        try {
            // Create a Scanner to read from the file
            Scanner scanner = new Scanner(new File(filePath));

            int sum = 0;
            int count = 0;

            // Read values from the file and compute the sum and count
            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                sum += value;
                count++;
            }

            // Close the scanner
            scanner.close();

            // Compute the average
            double average = count > 0 ? (double) sum / count : 0;

            // Print the sum, count, and average
            System.out.println("Sum of values: " + sum);
            System.out.println("Number of values: " + count);
            System.out.println("Average of values: " + average);
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
    }
}
