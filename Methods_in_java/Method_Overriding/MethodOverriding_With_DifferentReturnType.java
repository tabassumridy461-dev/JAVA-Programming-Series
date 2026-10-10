class Parent {

    Number getValue() {
        return 10;
    }
}

class Child extends Parent {

    @Override
    Integer getValue() {
        return 20;
    }
}

public class MethodOverriding_With_DifferentReturnType {

    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Child obj2 = new Child();

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
    }
}

// Output:
// 10
// 20
