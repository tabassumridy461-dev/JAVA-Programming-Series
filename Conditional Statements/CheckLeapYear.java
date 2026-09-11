import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }

        input.close();
    }
}

/*
Output:
Enter a year: 2024
It is a leap year.
*/
