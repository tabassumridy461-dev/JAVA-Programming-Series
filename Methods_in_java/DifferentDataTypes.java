public class DifferentDataTypes {

    static void display(int number) {
        System.out.println("Integer: " + number);
    }

    static void display(double number) {
        System.out.println("Double: " + number);
    }

    static void display(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {

        display(10);
        display(10.5);
        display("Java");
    }
}
