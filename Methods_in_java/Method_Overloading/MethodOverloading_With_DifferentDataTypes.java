class Display {

    void show(int number) {
        System.out.println("Integer: " + number);
    }

    void show(String text) {
        System.out.println("String: " + text);
    }

    void show(double number) {
        System.out.println("Double: " + number);
    }
}

public class MethodOverloading_With_DifferentDataTypes {

    public static void main(String[] args) {

        Display obj = new Display();

        obj.show(10);
        obj.show("Java");
        obj.show(5.5);
    }
}

// Output:
// Integer: 10
// String: Java
// Double: 5.5
