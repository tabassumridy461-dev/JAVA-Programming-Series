
public class TryCatch {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            // Risky code
            int result = a / b;

            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handles the exception
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program continues...");
    }
}

/*
Output:
Cannot divide by zero!
Program continues...
*/
