// ArrayAverage.java

public class ArrayAverage {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Variable to store the sum
        int sum = 0;

        // Calculate the sum
        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];
        }

        // Calculate the average
        double average = (double) sum / numbers.length;

        // Print the result
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}
