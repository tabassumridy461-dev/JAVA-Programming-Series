public class NestedWhileLoop {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 3) {

            int j = 1;

            while (j <= 3) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }

            i++;
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
