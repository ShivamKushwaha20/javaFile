// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Child class inheriting from Dog
class Labrador extends Dog {
    void color() {
        System.out.println("Labrador is brown in color.");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Multi-level inheritance example
        Labrador labrador = new Labrador();
        labrador.eat(); // Inherited from Animal
        labrador.bark(); // Inherited from Dog
        labrador.color(); // Specific to Labrador

        System.out.println(); // Empty line for separation

        // Hierarchical inheritance example
        Cat cat = new Cat();
        cat.eat(); // Inherited from Animal
        cat.meow(); // Specific to Cat
    }
}
