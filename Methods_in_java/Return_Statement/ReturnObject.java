public class ReturnObject {

    String name;
    int age;

    // Constructor
    ReturnObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method returns an object
    static ReturnObject createStudent() {
        return new ReturnObject("Tabassum", 22);
    }

    public static void main(String[] args) {

        ReturnObject student = createStudent();

        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
    }
}

/*
Output:
Student Name: Tabassum
Student Age: 22
*/
