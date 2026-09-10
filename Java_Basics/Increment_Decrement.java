public class IncrementDecrement {

    public static void main(String[] args) {

        int a = 10;

        // Increment: increase by 1
        a++;
        System.out.println("After Increment: " + a);

        // Decrement: decrease by 1
        a--;
        System.out.println("After Decrement: " + a);

        // Pre-increment
        int b = 10;
        System.out.println("Pre-Increment: " + (++b));

        // Post-increment
        int c = 10;
        System.out.println("Post-Increment: " + (c++));
        System.out.println("After Post-Increment: " + c);

        // Pre-decrement
        int d = 10;
        System.out.println("Pre-Decrement: " + (--d));

        // Post-decrement
        int e = 10;
        System.out.println("Post-Decrement: " + (e--));
        System.out.println("After Post-Decrement: " + e);
    }
}
