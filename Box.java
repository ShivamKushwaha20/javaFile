public class Box {
    private double length;
    private double width;
    private double height;

    // Parameterized constructor to initialize the dimensions of the box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate the volume of the box
    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        // Create two Box objects using the parameterized constructor
        Box box1 = new Box(5.0, 3.0, 2.0);
        Box box2 = new Box(4.0, 4.0, 4.0);

        // Calculate and display the volume of each box
        System.out.println("Volume of Box 1: " + box1.volume());
        System.out.println("Volume of Box 2: " + box2.volume());
    }
}
