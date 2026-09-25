public class InstanceMethod {

    void display() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {

        InstanceMethod obj = new InstanceMethod();

        obj.display();
    }
}
