public class BlockScopeDemo {
    public static void main(String[] args) {
        // Variables declared outside the block
        int outsideVariable = 10;

        // Block 1
        {
            int blockVariable1 = 20;
            System.out.println("Inside Block 1:");
            System.out.println("outsideVariable: " + outsideVariable);
            System.out.println("blockVariable1: " + blockVariable1);
        }

        // Block 2
        {
            int blockVariable2 = 30;
            System.out.println("\nInside Block 2:");
            System.out.println("outsideVariable: " + outsideVariable);
            // System.out.println("blockVariable1: " + blockVariable1); // Error: blockVariable1 is not accessible here
            System.out.println("blockVariable2: " + blockVariable2);
        }

        // System.out.println("blockVariable2: " + blockVariable2); // Error: blockVariable2 is not accessible here
    }
}
