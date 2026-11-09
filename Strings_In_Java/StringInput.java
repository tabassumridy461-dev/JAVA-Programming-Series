
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking a single word
        System.out.print("Enter your name: ");
        String name = input.next();

        // Taking a full line
        input.nextLine(); // Clear leftover newline

        System.out.print("Enter your university: ");
        String university = input.nextLine();

        // Printing input
        System.out.println("Name: " + name);
        System.out.println("University: " + university);

        input.close();

        // Output:
        // Enter your name: Tabassum
        // Enter your university: Daffodil International University
        // Name: Tabassum
        // University: Daffodil International University
    }
}
