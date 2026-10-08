public class Calculator {

    // Method for addition
    static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        double number1 = 20;
        double number2 = 5;

        System.out.println("Addition: " + add(number1, number2));
        System.out.println("Subtraction: " + subtract(number1, number2));
        System.out.println("Multiplication: " + multiply(number1, number2));
        System.out.println("Division: " + divide(number1, number2));
    }
}

/*
Output:
Addition: 25.0
Subtraction: 15.0
Multiplication: 100.0
Division: 4.0
*/
