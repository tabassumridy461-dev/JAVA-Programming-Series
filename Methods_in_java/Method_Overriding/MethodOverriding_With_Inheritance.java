class Parent {

    void display() {
        System.out.println("This is the Parent class");
    }
}

class Child extends Parent {

    @Override
    void display() {
        System.out.println("This is the Child class");
    }
}

public class MethodOverriding_With_Inheritance {

    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Child obj2 = new Child();

        obj1.display();
        obj2.display();
    }
}

// Output:
// This is the Parent class
// This is the Child class
