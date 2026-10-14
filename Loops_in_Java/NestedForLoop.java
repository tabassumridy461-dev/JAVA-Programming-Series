public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // Output:
        // i = 1, j = 1
        // i = 1, j = 2
        // i = 1, j = 3
        // i = 2, j = 1
        // i = 2, j = 2
        // i = 2, j = 3
        // i = 3, j = 1
        // i = 3, j = 2
        // i = 3, j = 3
    }
}
