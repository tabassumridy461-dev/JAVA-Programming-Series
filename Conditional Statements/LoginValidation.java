import java.util.Scanner;

public class LoginValidation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.print("Enter username: ");
        String enteredUsername = input.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = input.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }

        input.close();
    }
}

/*
Output:
Enter username: admin
Enter password: 1234
Login successful.
*/
