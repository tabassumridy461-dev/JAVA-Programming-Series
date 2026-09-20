public class ObjectMethodCall {

    String name;
    int age;

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        ObjectMethodCall student = new ObjectMethodCall();

        student.name = "Tabassum";
        student.age = 20;

        student.showInfo();
    }
}
