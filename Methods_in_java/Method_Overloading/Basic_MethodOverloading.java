class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Basic_MethodOverloading {

    public static void main(String[] args) {

        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
    }
}

// Output:
// 30
// 60
