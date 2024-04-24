public class UserDefinedClass {
    private String name;

    public UserDefinedClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class LocalVariableTypeInferenceDemo {
    public static void main(String[] args) {
        // Explicit type declaration
        UserDefinedClass user1 = new UserDefinedClass("Alice");
        System.out.println("Name of user1: " + user1.getName());

        // Type inference (will not work for user-defined class types)
        // var user2 = new UserDefinedClass("Bob"); // Compilation error
    }
}
