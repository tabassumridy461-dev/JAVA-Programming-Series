class Parent {

    protected void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    @Override
    public void display() {
        System.out.println("Child class method");
    }
}

public class MethodOverriding_With_AccessModifiers {

    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Child obj2 = new Child();

        obj1.display();
        obj2.display();
    }
}

// Output:
// Parent class method
// Child class method
