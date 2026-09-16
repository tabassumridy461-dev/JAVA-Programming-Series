// ArrayCopy.java

public class ArrayCopy {

    public static void main(String[] args) {

        // Create and initialize the original array
        int[] original = {10, 20, 30, 40, 50};

        // Create another array with the same size
        int[] copy = new int[original.length];

        // Copy each element
        for (int i = 0; i < original.length; i++) {

            copy[i] = original[i];
        }

        // Print the original array
        System.out.println("Original array:");

        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        // Print the copied array
        System.out.println("\nCopied array:");

        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
