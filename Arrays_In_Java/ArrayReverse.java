// ArrayReverse.java

public class ArrayReverse {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the original array
        System.out.println("Original array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Print the reversed array
        System.out.println("\nReversed array:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
