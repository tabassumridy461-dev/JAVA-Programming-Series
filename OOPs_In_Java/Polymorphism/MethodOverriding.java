class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.sound();

        /*
        Output:
        Dog barks.
        */
    }
}
