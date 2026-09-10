public class OperatorPrecedence {

    public static void main(String[] args) {

        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        // Output: 10 + 5 * 2 = 20

        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
        // Output: (10 + 5) * 2 = 30

        int result3 = 20 - 10 / 2;
        System.out.println("20 - 10 / 2 = " + result3);
        // Output: 20 - 10 / 2 = 15

        int result4 = 10 + 5 * 2 - 4;
        System.out.println("10 + 5 * 2 - 4 = " + result4);
        // Output: 10 + 5 * 2 - 4 = 16

        int result5 = (10 + 5) * (2 - 1);
        System.out.println("(10 + 5) * (2 - 1) = " + result5);
        // Output: (10 + 5) * (2 - 1) = 15
    }
}
