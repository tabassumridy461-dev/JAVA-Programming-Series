class Animal {

    // Final Method
    final void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.sound();
        d1.bark();

        /*
        Output:
        Animal makes a sound.
        Dog barks.
        */
    }
}
