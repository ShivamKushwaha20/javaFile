import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingDemo {
    public static void main(String[] args) {
        File file = new File("nonexistent.txt"); // Non-existent file

        try {
            FileReader reader = new FileReader(file);
            // Reading from the file (not included for simplicity)
            reader.close(); // Closing the file reader
        } catch (IOException e) {
            // Handling the checked exception
            System.err.println("File not found or error reading file: " + e.getMessage());
        }
    }
}
