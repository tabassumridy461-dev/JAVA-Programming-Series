public class StaticVsNonStatic {

    static void staticMethod() {
        System.out.println("Static method called.");
    }

    void nonStaticMethod() {
        System.out.println("Non-static method called.");
    }

    public static void main(String[] args) {

        // Calling static method directly
        staticMethod();

        // Creating object for non-static method
        StaticVsNonStatic obj = new StaticVsNonStatic();

        obj.nonStaticMethod();
    }
}
