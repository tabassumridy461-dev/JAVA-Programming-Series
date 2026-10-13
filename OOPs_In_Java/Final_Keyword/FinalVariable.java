class Student {

    // Final Variable
    final int MAX_MARKS = 100;

    void display() {
        System.out.println("Maximum Marks: " + MAX_MARKS);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();

        /*
        Output:
        Maximum Marks: 100
        */
    }
}
