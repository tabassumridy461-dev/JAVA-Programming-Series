public class Practice03 {

    // Method to find the largest of three numbers
    static int findLargest(int a, int b, int c) {

        int largest = a;

        if (b > largest) {
            largest = b;
        }

        if (c > largest) {
            largest = c;
        }

        return largest;
    }

    public static void main(String[] args) {

        int number1 = 25;
        int number2 = 50;
        int number3 = 35;

        int result = findLargest(number1, number2, number3);

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
        System.out.println("Largest Number: " + result);
    }
}

/*
Output:
Number 1: 25
Number 2: 50
Number 3: 35
Largest Number: 50
*/
