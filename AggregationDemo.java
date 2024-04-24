// Address class representing an address
class Address {
    private String street;
    private String city;
    private String state;

    // Constructor to initialize the address
    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    // Method to display the address
    public void displayAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + state);
    }
}

// Employee class representing an employee
class Employee {
    private String name;
    private Address address; // Aggregation - Employee has an Address

    // Constructor to initialize the employee
    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Method to display employee details including address
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        address.displayAddress(); // Calling method of Address class
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        // Create an Address object
        Address address = new Address("123 Main St", "Cityville", "State");

        // Create an Employee object with the Address object
        Employee employee = new Employee("John Doe", address);

        // Display employee details
        employee.displayEmployeeDetails();
    }
}
