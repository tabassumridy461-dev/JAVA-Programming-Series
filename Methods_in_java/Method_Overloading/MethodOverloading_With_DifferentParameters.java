class Calculator {

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class MethodOverloading_With_DifferentParameters {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.multiply(5, 4));
        System.out.println(obj.multiply(2.5, 4.0));
    }
}

// Output:
// 20
// 10.0
