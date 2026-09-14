public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }

        // Output:
        // 1
        // 2
        // 3
        // 4
        // 5
    }
}
