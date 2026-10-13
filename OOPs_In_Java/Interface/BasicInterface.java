interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

class BasicInterface {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.sound();

        /*
        Output:
        Dog barks.
        */
    }
}
