public class StringMethods {

    public static void main(String[] args) {

        String text = "Hello Java";

        System.out.println("Length: " + text.length());

        System.out.println("Uppercase: " + text.toUpperCase());

        System.out.println("Lowercase: " + text.toLowerCase());

        System.out.println("Character at index 1: " + text.charAt(1));

        System.out.println("Substring: " + text.substring(0, 5));

        System.out.println("Contains Java: " + text.contains("Java"));

        System.out.println("Starts with Hello: " + text.startsWith("Hello"));

        System.out.println("Ends with Java: " + text.endsWith("Java"));

        System.out.println("Replace: " + text.replace("Java", "World"));

        System.out.println("Equals: " + text.equals("Hello Java"));
    }

    /*
    Output:
    Length: 10
    Uppercase: HELLO JAVA
    Lowercase: hello java
    Character at index 1: e
    Substring: Hello
    Contains Java: true
    Starts with Hello: true
    Ends with Java: true
    Replace: Hello World
    Equals: true
    */
}
