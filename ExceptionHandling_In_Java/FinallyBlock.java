
public class FinallyBlock {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;

            System.out.println(result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            // Always executes after try-catch
            System.out.println("Finally block executed!");
        }

        System.out.println("Program ended.");
    }
}

/*
Output:
Cannot divide by zero!
Finally block executed!
Program ended.
*/
