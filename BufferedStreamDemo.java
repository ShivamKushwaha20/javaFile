import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String line;
            System.out.println("Enter lines (type 'STOP' to exit):");

            while (!(line = reader.readLine()).equals("STOP")) {
                System.out.println("Read line: " + line);
            }

            System.out.println("Exiting the program.");
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Error closing reader: " + e.getMessage());
            }
        }
    }
}
