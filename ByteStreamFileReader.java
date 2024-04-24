import java.io.FileInputStream;
import java.io.IOException;
import java.io.BufferedInputStream;

public class ByteStreamFileReader {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Path to the text file

        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            int data;
            while ((data = bufferedInputStream.read()) != -1) {
                System.out.print((char) data); // Convert byte to char and print
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
