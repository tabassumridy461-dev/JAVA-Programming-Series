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

class Puppy extends Dog {

    void weep() {
        System.out.println("Puppy is weeping.");
    }

    public static void main(String[] args) {

        Puppy p1 = new Puppy();

        p1.eat();
        p1.bark();
        p1.weep();

        /*
        Output:
        Animal is eating.
        Dog is barking.
        Puppy is weeping.
        */
    }
}
