class Student {

    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display Method
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Tabassum", 22);

        s1.display();

        /*
        Output:
        Name: Tabassum
        Age: 22
        */
    }
}
