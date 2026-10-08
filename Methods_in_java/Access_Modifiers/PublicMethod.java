public class PublicMethod {

    // Public method can be accessed from anywhere
    public void displayMessage() {
        System.out.println("This is a public method.");
    }

    public static void main(String[] args) {

        PublicMethod object = new PublicMethod();

        object.displayMessage();
    }
}

/*
Output:
This is a public method.
*/
