class Calculator {

    int calculate(int a, int b) {
        return a + b;
    }

    double calculate(double a, double b, double c) {
        return a + b + c;
    }
}

public class MethodOverloading_With_ReturnType {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        int result1 = obj.calculate(10, 20);
        double result2 = obj.calculate(10.5, 20.5, 30.0);

        System.out.println("Integer Result: " + result1);
        System.out.println("Double Result: " + result2);
    }
}

// Output:
// Integer Result: 30
// Double Result: 61.0
