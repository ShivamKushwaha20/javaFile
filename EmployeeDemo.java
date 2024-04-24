import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String address;

    // Method to get data from the user
    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
        scanner.close();
    }

    // Method to display employee data
    public void showData() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee employee = new Employee();

        // Get data from the user
        employee.getData();

        // Display employee data
        System.out.println("\nEmployee Details:");
        employee.showData();
    }
}
