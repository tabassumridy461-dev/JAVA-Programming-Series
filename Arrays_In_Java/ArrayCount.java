// ArrayCount.java

public class ArrayCount {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {10, 30, 15, 40, 50, 20};

        // Variable to store the count
        int count = 0;

        // Check every element
        for (int i = 0; i < numbers.length; i++) {

            // Check if the number is greater than 25
            if (numbers[i] > 25) {

                // Increase count by 1
                count++;
            }
        }

        // Print the result
        System.out.println("Numbers greater than 25: " + count);
    }
}
