
public class ClassWithMethods {

    String name = "Tabassum";

    void display() {
        System.out.println("Name: " + name);
    }

    void greet() {
        System.out.println("Hello, Welcome to Java OOP!");
    }

    public static void main(String[] args) {

        ClassWithMethods obj = new ClassWithMethods();

        obj.display();
        obj.greet();
    }
}

// Output:
// Name: Tabassum
// Hello, Welcome to Java OOP!
