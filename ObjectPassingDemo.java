class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ObjectPassingDemo {
    // Method that takes a Person object as a parameter
    public static void printPersonName(Person person) {
        System.out.println("Person's name: " + person.getName());
    }

    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person("Alice");

        // Pass the Person object to the printPersonName method
        printPersonName(person1);

        // Create another Person object
        Person person2 = new Person("Bob");

        // Pass the new Person object to the printPersonName method
        printPersonName(person2);
    }
}
