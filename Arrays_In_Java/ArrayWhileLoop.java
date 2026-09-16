// ArrayWhileLoop.java

public class ArrayWhileLoop {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Start from index 0
        int i = 0;

        // Continue while i is less than array length
        while (i < numbers.length) {

            // Print the current element
            System.out.println(numbers[i]);

            // Move to the next index
            i++;
        }
    }
}
