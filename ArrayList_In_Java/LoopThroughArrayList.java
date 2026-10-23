import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Loop through the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Output:
        // Apple
        // Banana
        // Mango
    }
}
