// TwoDimensionalArrayLoop.java

public class TwoDimensionalArrayLoop {

    public static void main(String[] args) {

        // Create and initialize a 2D array
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Outer loop controls the rows
        for (int i = 0; i < numbers.length; i++) {

            // Inner loop controls the columns
            for (int j = 0; j < numbers[i].length; j++) {

                // Print the current element
                System.out.print(numbers[i][j] + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
