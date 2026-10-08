public class ReturnArray {

    // Method returns an array
    static int[] createArray() {

        int[] numbers = {10, 20, 30, 40, 50};

        return numbers;
    }

    public static void main(String[] args) {

        int[] numbers = createArray();

        System.out.println("Array elements:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

/*
Output:
Array elements:
10 20 30 40 50
*/
