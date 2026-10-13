abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating.");
    }
}

interface Pet {

    void play();
}

class Dog extends Animal implements Pet {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.sound();
        d1.eat();
        d1.play();

        /*
        Output:
        Dog barks.
        Animal is eating.
        Dog is playing.
        */
    }
}
