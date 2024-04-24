// Base class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    String breed;

    Dog(String name, String breed) {
        // Call superclass constructor using super keyword
        super(name);
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking");
    }

    void displayDetails() {
        // Access superclass member using super keyword
        System.out.println("Name: " + super.name);
        System.out.println("Breed: " + breed);
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Call methods and display details
        myDog.eat(); // Call superclass method
        myDog.bark(); // Call subclass method
        myDog.displayDetails(); // Call subclass method using super keyword
    }
}
