import java.util.Scanner;

public class CheckPositiveNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("The number is positive.");
        }

        input.close();
    }
}

/*
Output:
Enter a number: 15
The number is positive.
*/
