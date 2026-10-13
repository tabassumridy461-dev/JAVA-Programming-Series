class Student {

    private String name;
    private int age;

    // Setter Method for Name
    public void setName(String name) {
        this.name = name;
    }

    // Setter Method for Age
    public void setAge(int age) {
        this.age = age;
    }

    // Display Method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Tabassum");
        s1.setAge(22);

        s1.display();

        /*
        Output:
        Name: Tabassum
        Age: 22
        */
    }
}
