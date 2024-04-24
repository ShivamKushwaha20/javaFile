public class AutoboxingUnboxingBooleanCharDemo {
    public static void main(String[] args) {
        // Autoboxing: primitive boolean to Boolean
        boolean primitiveBoolean = true;
        Boolean booleanObject = primitiveBoolean;

        System.out.println("Autoboxing: boolean to Boolean");
        System.out.println("Primitive boolean: " + primitiveBoolean);
        System.out.println("Boolean object: " + booleanObject);

        // Unboxing: Boolean to primitive boolean
        Boolean boxedBoolean = false;
        boolean unboxedBoolean = boxedBoolean;

        System.out.println("\nUnboxing: Boolean to boolean");
        System.out.println("Boolean object: " + boxedBoolean);
        System.out.println("Unboxed boolean: " + unboxedBoolean);

        // Autoboxing: primitive char to Character
        char primitiveChar = 'A';
        Character charObject = primitiveChar;

        System.out.println("\nAutoboxing: char to Character");
        System.out.println("Primitive char: " + primitiveChar);
        System.out.println("Character object: " + charObject);

        // Unboxing: Character to primitive char
        Character boxedChar = 'Z';
        char unboxedChar = boxedChar;

        System.out.println("\nUnboxing: Character to char");
        System.out.println("Character object: " + boxedChar);
        System.out.println("Unboxed char: " + unboxedChar);
    }
}
