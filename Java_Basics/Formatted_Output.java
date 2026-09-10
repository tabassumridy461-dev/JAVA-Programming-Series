public class FormattedOutput {

    public static void main(String[] args) {

        String name = "Tabassum";
        int age = 20;
        double cgpa = 3.83;

        System.out.printf("Name: %s%n", name);

        System.out.printf("Age: %d%n", age);

        System.out.printf("CGPA: %.2f%n", cgpa);

        System.out.printf("Name: %s, Age: %d, CGPA: %.2f%n", name, age, cgpa);
    }

    /*
    Output:
    Name: Tabassum
    Age: 20
    CGPA: 3.83
    Name: Tabassum, Age: 20, CGPA: 3.83
    */
}
