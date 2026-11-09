
public class BasicException {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // Division by zero causes an exception
        int result = a / b;

        System.out.println("Result: " + result);
    }
}

/*
Output:
Exception in thread "main"
java.lang.ArithmeticException: / by zero
*/
