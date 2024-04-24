public class NumberConvertDemo {
    public static void main(String[] args) {
        int decimalNumber = 42;

        // Convert to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);

        // Convert to hexadecimal
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal representation: " + hexadecimalNumber);

        // Convert to octal
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Octal representation: " + octalNumber);
    }
}
