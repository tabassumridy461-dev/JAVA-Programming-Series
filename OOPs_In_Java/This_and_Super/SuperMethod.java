class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    void display() {
        super.sound();
        sound();
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.display();

        /*
        Output:
        Animal makes a sound.
        Dog barks.
        */
    }
}
