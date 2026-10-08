public class ReturnString {

    // Method returns a String value
    static String getMessage() {
        return "Hello, Java!";
    }

    public static void main(String[] args) {

        String message = getMessage();

        System.out.println("Message: " + message);
    }
}

/*
Output:
Message: Hello, Java!
*/
