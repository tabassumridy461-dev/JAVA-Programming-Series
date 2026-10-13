class Student {

    String name;
    int age;

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

        Student s1 = new Student("Tabassum", 22);
        Student s2 = new Student("Ridy", 21);

        s1.display();
        s2.display();

        /*
        Output:
        Name: Tabassum
        Age: 22
        Name: Ridy
        Age: 21
        */
    }
}
