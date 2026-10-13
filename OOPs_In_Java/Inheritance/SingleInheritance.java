class Person {

    String name = "Tabassum";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {

    int age = 22;

    void displayAge() {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.displayName();
        s1.displayAge();

        /*
        Output:
        Name: Tabassum
        Age: 22
        */
    }
}
