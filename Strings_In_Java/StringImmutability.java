
public class StringImmutability {
    public static void main(String[] args) {

        String name = "Java";

        // Original String
        System.out.println("Before: " + name);

        // Creating a new String
        name.concat(" Programming");

        // Original String remains unchanged
        System.out.println("After concat: " + name);

        // Assigning the new String
        name = name.concat(" Programming");

        System.out.println("After assignment: " + name);

        // Output:
        // Before: Java
        // After concat: Java
        // After assignment: Java Programming
    }
}
