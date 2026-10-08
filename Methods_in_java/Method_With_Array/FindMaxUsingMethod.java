public class FindMaxUsingMethod {

    // Method finds the maximum value in an array
    static int findMaximum(int[] numbers) {

        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {25, 10, 45, 30, 60, 15};

        int maximum = findMaximum(numbers);

        System.out.println("Maximum value: " + maximum);
    }
}

/*
Output:
Maximum value: 60
*/
