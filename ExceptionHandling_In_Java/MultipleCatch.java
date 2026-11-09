
public class MultipleCatch {
    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            // Array index 5 does not exist
            System.out.println(numbers[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred!");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range!");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred!");
        }
    }
}

/*
Output:
Array index is out of range!
*/
