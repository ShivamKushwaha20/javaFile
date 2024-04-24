class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector add(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector subtract(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public Vector scalarMultiply(double scalar) {
        return new Vector(this.x * scalar, this.y * scalar, this.z * scalar);
    }

    public double dotProduct(Vector other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector crossProduct(Vector other) {
        double newX = this.y * other.z - this.z * other.y;
        double newY = this.z * other.x - this.x * other.z;
        double newZ = this.x * other.y - this.y * other.x;
        return new Vector(newX, newY, newZ);
    }

    public double magnitude() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    public void printVector(String label) {
        System.out.println(label + " Vector: [" + this.x + ", " + this.y + ", " + this.z + "]");
    }
}

public class VectorOperationsDemo {
    public static void main(String[] args) {
        Vector vector1 = new Vector(2, 3, 4);
        Vector vector2 = new Vector(-1, 5, 2);

        // Addition
        Vector sum = vector1.add(vector2);
        sum.printVector("Sum");

        // Subtraction
        Vector difference = vector1.subtract(vector2);
        difference.printVector("Difference");

        // Scalar multiplication
        Vector scaled = vector1.scalarMultiply(2.5);
        scaled.printVector("Scaled");

        // Dot product
        double dotProduct = vector1.dotProduct(vector2);
        System.out.println("Dot Product: " + dotProduct);

        // Cross product
        Vector crossProduct = vector1.crossProduct(vector2);
        crossProduct.printVector("Cross");

        // Magnitude
        double magnitude = vector1.magnitude();
        System.out.println("Magnitude: " + magnitude);
    }
}
