// ArrayMinimum.java

public class ArrayMinimum {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {25, 10, 45, 30, 60};

        // Assume the first element is the minimum
        int min = numbers[0];

        // Check the remaining elements
        for (int i = 1; i < numbers.length; i++) {

            // If current element is smaller than min
            if (numbers[i] < min) {

                // Update min
                min = numbers[i];
            }
        }

        // Print the minimum value
        System.out.println("Minimum = " + min);
    }
}
