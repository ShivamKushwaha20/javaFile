import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        try (
            // Create input and output streams using try-with-resources
            FileInputStream inputStream = new FileInputStream(sourceFile);
            FileOutputStream outputStream = new FileOutputStream(destinationFile);
        ) {
            // Read bytes from the source file and write them to the destination file
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }
    }
}
