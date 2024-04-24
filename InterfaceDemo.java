// Interface
interface Animal {
    void makeSound(); // Abstract method (implicitly public and abstract)
}

// Implementing class 1
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Implementing class 2
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Upcasting
        Animal cat = new Cat(); // Upcasting

        dog.makeSound(); // Calls Dog's makeSound method
        cat.makeSound(); // Calls Cat's makeSound method
    }
}
