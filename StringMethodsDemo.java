public class StringMethodsDemo {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // Length of the string
        System.out.println("Length of str1: " + str1.length());

        // Concatenation
        String str3 = str1.concat(" Welcome");
        System.out.println("Concatenated string: " + str3);

        // Substring
        String substring = str2.substring(5);
        System.out.println("Substring from index 5: " + substring);

        // Index of a character
        int index = str1.indexOf('W');
        System.out.println("Index of 'W' in str1: " + index);

        // Upper case and lower case
        System.out.println("Upper case of str2: " + str2.toUpperCase());
        System.out.println("Lower case of str2: " + str2.toLowerCase());

        // Replace characters
        String replaced = str1.replace('o', 'x');
        System.out.println("String with replaced characters: " + replaced);

        // Check if a string contains another string
        boolean contains = str2.contains("Java");
        System.out.println("Does str2 contain 'Java'? " + contains);

        // Compare strings
        boolean isEqual = str1.equals(str2);
        System.out.println("Are str1 and str2 equal? " + isEqual);
    }
}
