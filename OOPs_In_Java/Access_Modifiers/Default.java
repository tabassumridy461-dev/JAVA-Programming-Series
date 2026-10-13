class Student {

    // Default Access Variables
    String name = "Tabassum";
    int age = 22;

    // Default Access Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Default {

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
