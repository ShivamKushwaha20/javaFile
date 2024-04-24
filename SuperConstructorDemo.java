// Base class
class Parent {
    private String name;

    // Base class constructor
    public Parent(String name) {
        this.name = name;
    }

    // Method to display parent's name
    public void display() {
        System.out.println("Parent's name: " + name);
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    private int age;

    // Child class constructor using super() to invoke base class constructor
    public Child(String name, int age) {
        super(name); // Invoking base class constructor
        this.age = age;
    }

    // Method to display child's age
    public void displayAge() {
        System.out.println("Child's age: " + age);
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child child = new Child("John", 10);

        // Displaying parent's name and child's age
        child.display(); // Invokes display() method of Parent class
        child.displayAge(); // Invokes displayAge() method of Child class
    }
}
