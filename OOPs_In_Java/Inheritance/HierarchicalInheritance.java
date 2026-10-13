class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing.");
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        Cat c1 = new Cat();

        d1.eat();
        d1.bark();

        c1.eat();
        c1.meow();

        /*
        Output:
        Animal is eating.
        Dog is barking.
        Animal is eating.
        Cat is meowing.
        */
    }
}
