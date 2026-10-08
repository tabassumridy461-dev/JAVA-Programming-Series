public class Practice01 {

    // Method to calculate the square of a number
    static int calculateSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int number = 8;

        int result = calculateSquare(number);

        System.out.println("Number: " + number);
        System.out.println("Square: " + result);
    }
}

/*
Output:
Number: 8
Square: 64
*/
