import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Print the ArrayList
        System.out.println("ArrayList: " + fruits);

        // Access an element
        System.out.println("Element: " + fruits.get(0));

        // Update an element
        fruits.set(1, "Orange");
        System.out.println("After update: " + fruits);

        // Check if an element exists
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // Get the size
        System.out.println("Size: " + fruits.size());

        // Remove an element
        fruits.remove("Apple");
        System.out.println("After remove: " + fruits);

        // Check if the ArrayList is empty
        System.out.println("Is empty: " + fruits.isEmpty());

        // Remove all elements
        fruits.clear();
        System.out.println("After clear: " + fruits);

        // Output:
        // ArrayList: [Apple, Banana, Mango]
        // Element: Apple
        // After update: [Apple, Orange, Mango]
        // Contains Mango: true
        // Size: 3
        // After remove: [Orange, Mango]
        // Is empty: false
        // After clear: []
    }
}
