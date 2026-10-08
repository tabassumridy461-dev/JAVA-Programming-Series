public class ReverseString {

    // Method returns the reversed String
    static String reverse(String text) {

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return reversed;
    }

    public static void main(String[] args) {

        String text = "Java";

        String result = reverse(text);

        System.out.println("Original String: " + text);
        System.out.println("Reversed String: " + result);
    }
}

/*
Output:
Original String: Java
Reversed String: avaJ
*/
