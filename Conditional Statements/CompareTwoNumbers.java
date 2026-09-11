import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("First number is greater.");
        } else if (num1 < num2) {
            System.out.println("Second number is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}

/*
Output:
Enter first number: 25
Enter second number: 18
First number is greater.
*/
