class Student {

    // Private Variables
    private String name;
    private int age;

    // Setter Method
    public void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    // Getter Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setDetails("Tabassum", 22);
        s1.display();

        /*
        Output:
        Name: Tabassum
        Age: 22
        */
    }
}
