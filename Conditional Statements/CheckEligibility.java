import java.util.Scanner;

public class CheckEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible.");
        } else {
            System.out.println("You are not eligible.");
        }

        input.close();
    }
}

/*
Output:
Enter your age: 20
You are eligible.
*/
