public class BooleanOperatorsDemo {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        // Logical AND (&&) operator
        boolean resultAnd = bool1 && bool2;
        System.out.println("Logical AND (&&) Result: " + resultAnd);

        // Logical OR (||) operator
        boolean resultOr = bool1 || bool2;
        System.out.println("Logical OR (||) Result: " + resultOr);

        // Logical NOT (!) operator
        boolean resultNot1 = !bool1;
        System.out.println("Logical NOT (!) Result (bool1): " + resultNot1);
        
        boolean resultNot2 = !bool2;
        System.out.println("Logical NOT (!) Result (bool2): " + resultNot2);
    }
}
