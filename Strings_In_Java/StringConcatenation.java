
public class StringConcatenation {
    public static void main(String[] args) {

        String firstName = "Tabassum";
        String lastName = "Islam";

        // Joining two Strings
        String fullName = firstName + " " + lastName;

        // Joining String with another String
        String message = "Hello, " + fullName;

        System.out.println("Full Name: " + fullName);
        System.out.println(message);

        // Output:
        // Full Name: Tabassum Islam
        // Hello, Tabassum Islam
    }
}
