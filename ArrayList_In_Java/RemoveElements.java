import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Remove element at index 1
        fruits.remove(1);

        // Print the ArrayList
        System.out.println(fruits);

        // Output:
        // [Apple, Mango]
    }
}
