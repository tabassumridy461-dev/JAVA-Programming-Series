class Display {

    void show(int number, String text) {
        System.out.println("Number: " + number + ", Text: " + text);
    }

    void show(String text, int number) {
        System.out.println("Text: " + text + ", Number: " + number);
    }
}

public class MethodOverloading_With_DifferentOrderOfParameters {

    public static void main(String[] args) {

        Display obj = new Display();

        obj.show(10, "Java");
        obj.show("Python", 20);
    }
}

// Output:
// Number: 10, Text: Java
// Text: Python, Number: 20
