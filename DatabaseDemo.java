import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabaseDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        // Step 1: Establish connection to the database
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database.");

            // Step 2: Insert data into the database
            insertData(connection, "John Doe", 30, "123 Main St");

            // Step 3: Update data in the database
            updateData(connection, "John Doe", 35, "456 Elm St");

            System.out.println("Data inserted and updated successfully.");
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }

    private static void insertData(Connection connection, String name, int age, String address) throws SQLException {
        String insertQuery = "INSERT INTO employee (name, age, address) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, address);

            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Data inserted successfully.");
            }
        }
    }

    private static void updateData(Connection connection, String name, int newAge, String newAddress) throws SQLException {
        String updateQuery = "UPDATE employee SET age = ?, address = ? WHERE name = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setInt(1, newAge);
            preparedStatement.setString(2, newAddress);
            preparedStatement.setString(3, name);

            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Data updated successfully.");
            }
        }
    }
}
