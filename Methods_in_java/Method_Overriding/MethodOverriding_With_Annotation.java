class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverriding_With_Annotation {

    public static void main(String[] args) {

        Animal animal = new Cat();

        animal.sound();
    }
}

// Output:
// Cat meows
