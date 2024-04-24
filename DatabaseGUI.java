import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class DatabaseGUI {
    private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        // Step 1: Establish connection to the database
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            System.out.println("Connected to the database.");

            // Step 2: Fetch data from the database
            String query = "SELECT * FROM employee";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                // Step 3: Create GUI to display data
                JFrame frame = new JFrame("Employee Details");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 300);

                JPanel panel = new JPanel(new GridLayout(0, 1));
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String address = resultSet.getString("address");
                    JLabel label = new JLabel("Name: " + name + ", Age: " + age + ", Address: " + address);
                    panel.add(label);
                }

                JScrollPane scrollPane = new JScrollPane(panel);
                frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
                frame.setVisible(true);
            }
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
