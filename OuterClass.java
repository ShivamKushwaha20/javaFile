public class OuterClass {
    private int value;

    public OuterClass(int value) {
        this.value = value;
    }

    // Inner class definition
    public class InnerClass {
        public void display() {
            System.out.println("Value from OuterClass: " + value);
        }
    }

    public static void main(String[] args) {
        // Create an instance of OuterClass
        OuterClass outer = new OuterClass(42);

        // Create instances of InnerClass within a loop
        for (int i = 0; i < 3; i++) {
            InnerClass inner = outer.new InnerClass();
            inner.display();
        }
    }
}
