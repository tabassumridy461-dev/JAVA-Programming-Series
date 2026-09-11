import java.util.Scanner;

public class FindLargestOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("Largest number: " + num1);
        } else if (num2 > num1) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}

/*
Output:
Enter first number: 50
Enter second number: 35
Largest number: 50
*/
