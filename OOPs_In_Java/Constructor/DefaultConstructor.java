class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Tabassum";
        age = 22;
    }

    // Display Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}
