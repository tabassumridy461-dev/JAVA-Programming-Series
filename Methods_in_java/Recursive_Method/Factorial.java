public class Factorial {

    // Recursive method to calculate factorial
    static int calculateFactorial(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        return number * calculateFactorial(number - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        int result = calculateFactorial(number);

        System.out.println("Factorial of " + number + ": " + result);
    }
}

/*
Output:
Factorial of 5: 120
*/
