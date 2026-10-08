public class StudentResult {

    String name;
    double marks;

    // Constructor
    StudentResult(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate grade
    static String calculateGrade(double marks) {

        if (marks >= 80) {
            return "A+";
        } else if (marks >= 70) {
            return "A";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else if (marks >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student result
    void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade(marks));
    }

    public static void main(String[] args) {

        StudentResult student = new StudentResult("Tabassum", 85);

        student.displayResult();
    }
}

/*
Output:
Student Name: Tabassum
Marks: 85.0
Grade: A+
*/
