import java.util.Scanner;

public class FindLargestOfThree {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest number: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest number: " + num2);
        } else {
            System.out.println("Largest number: " + num3);
        }

        input.close();
    }
}

/*
Output:
Enter first number: 25
Enter second number: 40
Enter third number: 15
Largest number: 40
*/
