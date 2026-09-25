public class ObjectMethodCall {

    void studentInfo() {
        System.out.println("Name: Rahim");
        System.out.println("Department: Software Engineering");
    }

    public static void main(String[] args) {

        ObjectMethodCall student = new ObjectMethodCall();

        student.studentInfo();
    }
}
