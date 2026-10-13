interface Animal {

    void eat();
}

interface Pet extends Animal {

    void play();
}

class Dog implements Pet {

    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.play();

        /*
        Output:
        Dog is eating.
        Dog is playing.
        */
    }
}
