public class Practice04 {

    // Method to calculate the average of three numbers
    static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {

        int number1 = 80;
        int number2 = 70;
        int number3 = 90;

        double average = calculateAverage(number1, number2, number3);

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
        System.out.println("Average: " + average);
    }
}

/*
Output:
Number 1: 80
Number 2: 70
Number 3: 90
Average: 80.0
*/
