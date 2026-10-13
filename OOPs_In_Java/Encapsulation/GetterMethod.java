class Student {

    private String name = "Tabassum";
    private int age = 22;

    // Getter Method for Name
    public String getName() {
        return name;
    }

    // Getter Method for Age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());

        /*
        Output:
        Name: Tabassum
        Age: 22
        */
    }
}
