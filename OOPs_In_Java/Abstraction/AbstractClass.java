abstract class Animal {

    // Concrete Method
    void eat() {
        System.out.println("Animal is eating.");
    }

    // Abstract Method
    abstract void sound();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.sound();

        /*
        Output:
        Animal is eating.
        Dog barks.
        */
    }
}
