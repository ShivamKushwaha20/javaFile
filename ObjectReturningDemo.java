class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ObjectReturningDemo {
    // Method that returns a Person object
    public static Person createPerson(String name, int age) {
        return new Person(name, age);
    }

    public static void main(String[] args) {
        // Create a Person object using the createPerson method
        Person person1 = createPerson("Alice", 30);

        // Display the details of the created Person object
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}
