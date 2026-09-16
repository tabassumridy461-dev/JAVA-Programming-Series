// TwoDimensionalArray.java

public class TwoDimensionalArray {

    public static void main(String[] args) {

        // Create and initialize a 2D array
        int[][] numbers = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Access individual elements
        System.out.println("First element: " + numbers[0][0]);
        System.out.println("Second row, third element: " + numbers[1][2]);
        System.out.println("Third row, second element: " + numbers[2][1]);
    }
}
