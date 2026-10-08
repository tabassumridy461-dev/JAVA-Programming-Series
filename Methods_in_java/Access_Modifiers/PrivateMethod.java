public class PrivateMethod {

    // Private method can be accessed only inside this class
    private void displayMessage() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {

        PrivateMethod object = new PrivateMethod();

        object.displayMessage();
    }
}

/*
Output:
This is a private method.
*/
