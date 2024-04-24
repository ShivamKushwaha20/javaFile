public class ThreeDimensionalArrayDemo {
    public static void main(String[] args) {
        // Define a three-dimensional array
        int[][][] threeDArray = new int[3][3][3];

        // Initialize the array with values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    threeDArray[i][j][k] = i + j + k;
                }
            }
        }

        // Print the elements of the array
        System.out.println("Three-Dimensional Array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.println("threeDArray[" + i + "][" + j + "][" + k + "] = " + threeDArray[i][j][k]);
                }
            }
        }
    }
}
