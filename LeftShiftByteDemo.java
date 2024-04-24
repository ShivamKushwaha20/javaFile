public class LeftShiftByteDemo {
    public static void main(String[] args) {
        byte byteValue = 15; // Binary: 00001111

        // Left shift by 2 positions
        int shiftedValue = byteValue << 2; // Binary: 00111100 (Decimal: 60)
        System.out.println("Original Byte Value: " + byteValue);
        System.out.println("Left Shifted Value by 2: " + shiftedValue);
    }
}
