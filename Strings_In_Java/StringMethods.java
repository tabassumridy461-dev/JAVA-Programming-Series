
public class StringMethods {
    public static void main(String[] args) {

        String text = "Hello Java";

        // Convert to uppercase
        System.out.println(text.toUpperCase());

        // Convert to lowercase
        System.out.println(text.toLowerCase());

        // Extract part of a String
        System.out.println(text.substring(0, 5));

        // Check whether String contains a word
        System.out.println(text.contains("Java"));

        // Find the position of a character
        System.out.println(text.indexOf('J'));

        // Remove leading and trailing spaces
        System.out.println("  Java  ".trim());

        // Output:
        // HELLO JAVA
        // hello java
        // Hello
        // true
        // 6
        // Java
    }
}
