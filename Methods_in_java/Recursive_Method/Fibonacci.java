public class Fibonacci {

    // Recursive method to find Fibonacci number
    static int fibonacci(int number) {

        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {

        int terms = 7;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

/*
Output:
Fibonacci Series:
0 1 1 2 3 5 8
*/
