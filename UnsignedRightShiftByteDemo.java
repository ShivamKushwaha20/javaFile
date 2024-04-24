public class UnsignedRightShiftByteDemo {
    public static void main(String[] args) {
        byte byteValue = (byte) 0xFF; // Binary: 11111111

        // Simulate unsigned right shift by converting to int
        int intValue = byteValue & 0xFF; // Convert to int without sign extension
        int unsignedShiftedValue = intValue >>> 2; // Unsigned right shift by 2 positions

        // Print results
        System.out.println("Original Byte Value: " + byteValue);
        System.out.println("Unsigned Right Shifted Value by 2: " + unsignedShiftedValue);
    }
}
