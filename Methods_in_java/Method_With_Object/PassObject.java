public class PassObject {

    String name;
    int age;

    // Constructor
    PassObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method receives an object as a parameter
    static void displayStudent(PassObject student) {
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
    }

    public static void main(String[] args) {

        PassObject student = new PassObject("Tabassum", 22);

        displayStudent(student);
    }
}

/*
Output:
Student Name: Tabassum
Student Age: 22
*/
