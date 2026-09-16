// ArraySum.java

public class ArraySum {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store the total sum
        int sum = 0;

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {

            // Add each element to sum
            sum = sum + numbers[i];
        }

        // Print the total sum
        System.out.println("Sum = " + sum);
    }
}
