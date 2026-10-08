public class Practice02 {

    // Method to check whether a number is even or odd
    static String checkEvenOdd(int number) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        int number = 15;

        String result = checkEvenOdd(number);

        System.out.println("Number: " + number);
        System.out.println("Result: " + result);
    }
}

/*
Output:
Number: 15
Result: Odd
*/
