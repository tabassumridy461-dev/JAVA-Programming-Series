import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Access elements using index
        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        // Output:
        // Apple
        // Banana
        // Mango
    }
}
