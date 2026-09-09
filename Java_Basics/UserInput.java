import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();

        System.out.println("\n--- Student Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);

        input.close();
    }
}

Example Output:

Enter your name: Tabassum
Enter your age: 22
Enter your CGPA: 3.83

--- Student Information ---
Name: Tabassum
Age: 22
CGPA: 3.83
