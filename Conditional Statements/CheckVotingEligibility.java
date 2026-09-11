import java.util.Scanner;

public class CheckVotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        input.close();
    }
}

/*
Output:
Enter your age: 19
You are eligible to vote.
*/
