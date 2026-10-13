class Student {

    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Display Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Tabassum", 22);

        s1.display();
        s2.display();

        /*
        Output:
        Name: Unknown
        Age: 0
        Name: Tabassum
        Age: 22
        */
    }
}
