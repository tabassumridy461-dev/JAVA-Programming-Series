public class StringConcatenation {

    public static void main(String[] args) {

        String firstName = "Tabassum";
        String lastName = "Islam";

        String fullName = firstName + " " + lastName;

        System.out.println("Full Name: " + fullName);

        String greeting = "Hello, " + firstName;

        System.out.println("Greeting: " + greeting);

        int age = 20;

        String information = "My name is " + firstName + " and I am " + age + " years old.";

        System.out.println("Information: " + information);

        String result = "Java" + " " + "Programming";

        System.out.println("Result: " + result);
    }

    /*
    Output:
    Full Name: Tabassum Islam
    Greeting: Hello, Tabassum
    Information: My name is Tabassum and I am 20 years old.
    Result: Java Programming
    */
}
