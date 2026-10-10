class Parent {

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    @Override
    void display() {
        super.display();
        System.out.println("Child class method");
    }
}

public class MethodOverriding_With_SuperKeyword {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}

// Output:
// Parent class method
// Child class method
