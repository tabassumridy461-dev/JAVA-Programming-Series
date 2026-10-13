class Calculator {

    // Method with Two Parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with Three Parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with Different Data Types
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        Calculator c1 = new Calculator();

        System.out.println("Sum of Two Numbers: " + c1.add(10, 20));
        System.out.println("Sum of Three Numbers: " + c1.add(10, 20, 30));
        System.out.println("Sum of Decimal Numbers: " + c1.add(5.5, 4.5));

        /*
        Output:
        Sum of Two Numbers: 30
        Sum of Three Numbers: 60
        Sum of Decimal Numbers: 10.0
        */
    }
}
