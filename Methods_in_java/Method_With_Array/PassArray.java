public class PassArray {

    // Method receives an array as a parameter
    static void displayArray(int[] numbers) {

        System.out.println("Array elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        displayArray(numbers);
    }
}

/*
Output:
Array elements:
10 20 30 40 50
*/
