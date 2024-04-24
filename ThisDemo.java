class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        this.printMessage(); // Calling another method using 'this'
    }

    private void printMessage() {
        System.out.println("This is a private method called using 'this'.");
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        student1.displayInfo();

        System.out.println(); // Empty line for separation

        Student student2 = new Student("Jane", 22);
        student2.displayInfo();
    }
}
