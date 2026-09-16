// ArrayInput.java

import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create an array of size 5
        int[] numbers = new int[5];

        // Take input for each array element
        for (int i = 0; i < numbers.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");

            numbers[i] = input.nextInt();
        }

        // Close Scanner
        input.close();
    }
}
