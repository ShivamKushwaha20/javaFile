import java.util.EmptyStackException;

public class IntegerStack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    public IntegerStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1; // Initialize top as -1 (empty stack)
    }

    public void push(int element) {
        if (top < maxSize - 1) {
            stackArray[++top] = element;
            System.out.println("Pushed " + element + " onto the stack.");
        } else {
            System.out.println("Stack is full. Cannot push " + element + ".");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped " + poppedElement + " from the stack.");
            return poppedElement;
        } else {
            throw new EmptyStackException();
        }
    }

    public static void main(String[] args) {
        // Create an integer stack with a maximum size of 10
        IntegerStack stack = new IntegerStack(10);

        // Push some numbers onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // Pop the numbers off the stack
        stack.pop();
        stack.pop();
        stack.pop();
        //stack.pop(); // Uncommenting this line will throw an EmptyStackException

        // Try popping from an empty stack (will throw EmptyStackException)
        //stack.pop();
    }
}
