public class DifferentParameters {

    static void show(int a) {
        System.out.println("One number: " + a);
    }

    static void show(int a, int b) {
        System.out.println("Two numbers: " + a + ", " + b);
    }

    static void show(int a, int b, int c) {
        System.out.println("Three numbers: " + a + ", " + b + ", " + c);
    }

    public static void main(String[] args) {

        show(10);
        show(10, 20);
        show(10, 20, 30);
    }
}
