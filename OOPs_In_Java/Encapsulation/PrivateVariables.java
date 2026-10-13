class Student {

    // Private Variables
    private String name = "Tabassum";
    private int age = 22;

    // Display Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();

        /*
        Output:
        Name: Tabassum
        Age: 22
        */
    }
}
