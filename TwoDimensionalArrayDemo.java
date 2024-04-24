public class TwoDimensionalArrayDemo {
    public static void main(String[] args) {
        // Define a two-dimensional array
        int[][] twoDArray = new int[3][4];

        // Initialize the array with values
        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                twoDArray[i][j] = value;
                value++;
            }
        }

        // Print the elements of the array
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
