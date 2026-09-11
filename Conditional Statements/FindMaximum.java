import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int maximum = (num1 > num2) ? num1 : num2;

        System.out.println("Maximum number: " + maximum);

        input.close();
    }
}

/*
Output:
Enter first number: 30
Enter second number: 45
Maximum number: 45
*/
