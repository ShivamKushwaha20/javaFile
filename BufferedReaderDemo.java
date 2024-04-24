import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Reading a character
            System.out.print("Enter a character: ");
            char ch = (char) reader.read();
            System.out.println("Character entered: " + ch);

            // Reading a string
            System.out.print("Enter a string: ");
            String line = reader.readLine();
            System.out.println("String entered: " + line);

            // Reading an integer
            System.out.print("Enter an integer: ");
            int num = Integer.parseInt(reader.readLine());
            System.out.println("Integer entered: " + num);

            // Reading a floating-point number
            System.out.print("Enter a floating-point number: ");
            double d = Double.parseDouble(reader.readLine());
            System.out.println("Floating-point number entered: " + d);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing BufferedReader: " + e.getMessage());
            }
        }
    }
}
