public class ForEachLoopDemo {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Using for-each loop to iterate over the array
        System.out.println("Using for-each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Create a list of strings
        String[] names = { "Alice", "Bob", "Charlie" };

        // Using for-each loop to iterate over the list
        System.out.println("\nUsing for-each loop with strings:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
