// ArrayMaximum.java

public class ArrayMaximum {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {25, 10, 45, 30, 60};

        // Assume the first element is the maximum
        int max = numbers[0];

        // Check the remaining elements
        for (int i = 1; i < numbers.length; i++) {

            // If current element is greater than max
            if (numbers[i] > max) {

                // Update max
                max = numbers[i];
            }
        }

        // Print the maximum value
        System.out.println("Maximum = " + max);
    }
}
