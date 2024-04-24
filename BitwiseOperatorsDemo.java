public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        // Bitwise AND (&) operator
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011
        int resultAnd = num1 & num2; // Binary: 0001 (Decimal: 1)
        System.out.println("Bitwise AND (&) Result: " + resultAnd);

        // Bitwise OR (|) operator
        int resultOr = num1 | num2; // Binary: 0111 (Decimal: 7)
        System.out.println("Bitwise OR (|) Result: " + resultOr);

        // Bitwise XOR (^) operator
        int resultXor = num1 ^ num2; // Binary: 0110 (Decimal: 6)
        System.out.println("Bitwise XOR (^) Result: " + resultXor);

        // Bitwise NOT (~) operator
        int num3 = 10; // Binary: 1010
        int resultNot = ~num3; // Binary: 0101 (Decimal: -11 due to two's complement)
        System.out.println("Bitwise NOT (~) Result: " + resultNot);

        // Left shift (<<) operator
        int num4 = 7; // Binary: 0111
        int resultLeftShift = num4 << 2; // Binary: 011100 (Decimal: 28)
        System.out.println("Left Shift (<<) Result: " + resultLeftShift);

        // Right shift (>>) operator
        int num5 = 16; // Binary: 10000
        int resultRightShift = num5 >> 2; // Binary: 0001 (Decimal: 4)
        System.out.println("Right Shift (>>) Result: " + resultRightShift);

        // Unsigned right shift (>>>) operator
        int num6 = -16; // Binary: 11111111111111111111111111110000 (Decimal: -16)
        int resultUnsignedRightShift = num6 >>> 2; // Binary: 00111111111111111111111111111100 (Decimal: 1073741820)
        System.out.println("Unsigned Right Shift (>>>) Result: " + resultUnsignedRightShift);
    }
}
