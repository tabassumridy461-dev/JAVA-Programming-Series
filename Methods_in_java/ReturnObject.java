public class ReturnObject {

    String name;
    int age;

    static ReturnObject getStudent() {

        ReturnObject student = new ReturnObject();

        student.name = "Tabassum";
        student.age = 20;

        return student;
    }

    public static void main(String[] args) {

        ReturnObject student = getStudent();

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}
