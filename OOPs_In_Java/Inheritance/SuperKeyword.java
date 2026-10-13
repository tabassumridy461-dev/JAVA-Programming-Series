class Animal {

    String name = "Animal";

    void display() {
        System.out.println("Parent class method.");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void show() {
        System.out.println("Name: " + super.name);
        System.out.println("Name: " + name);

        super.display();
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.show();

        /*
        Output:
        Name: Animal
        Name: Dog
        Parent class method.
        */
    }
}
