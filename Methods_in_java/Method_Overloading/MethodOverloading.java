public class MethodOverloading {

    static void display() {
        System.out.println("No parameter");
    }

    static void display(int number) {
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        display();
        display(10);
    }
}
