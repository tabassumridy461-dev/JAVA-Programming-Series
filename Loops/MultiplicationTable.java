public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Output:
        // 5 x 1 = 5
        // 5 x 2 = 10
        // 5 x 3 = 15
        // 5 x 4 = 20
        // 5 x 5 = 25
        // 5 x 6 = 30
        // 5 x 7 = 35
        // 5 x 8 = 40
        // 5 x 9 = 45
        // 5 x 10 = 50
    }
}
