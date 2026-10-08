public class ProtectedMethod {

    // Protected method can be accessed within the same package
    // and by subclasses in other packages
    protected void displayMessage() {
        System.out.println("This is a protected method.");
    }

    public static void main(String[] args) {

        ProtectedMethod object = new ProtectedMethod();

        object.displayMessage();
    }
}

/*
Output:
This is a protected method.
*/
