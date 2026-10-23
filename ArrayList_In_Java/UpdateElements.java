import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Update element at index 1
        fruits.set(1, "Orange");

        // Print the updated ArrayList
        System.out.println(fruits);

        // Output:
        // [Apple, Orange, Mango]
    }
}
