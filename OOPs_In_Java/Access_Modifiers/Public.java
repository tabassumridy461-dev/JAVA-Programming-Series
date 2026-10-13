class Student {

    // Public Variables
    public String name = "Tabassum";
    public int age = 22;

    // Public Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        s1.display();

        /*
        Output:
        Name: Tabassum
        Age: 22
        Name: Tabassum
        Age: 22
        */
    }
}
