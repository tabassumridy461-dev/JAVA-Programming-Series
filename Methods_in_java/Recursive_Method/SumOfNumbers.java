public class SumOfNumbers {

    // Recursive method to calculate sum of numbers
    static int calculateSum(int number) {

        if (number == 0) {
            return 0;
        }

        return number + calculateSum(number - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        int result = calculateSum(number);

        System.out.println("Sum of numbers from 1 to " + number + ": " + result);
    }
}

/*
Output:
Sum of numbers from 1 to 5: 15
*/
