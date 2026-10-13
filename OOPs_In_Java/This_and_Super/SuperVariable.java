class Animal {

    String name = "Animal";
}

class Dog extends Animal {

    String name = "Dog";

    void display() {
        System.out.println("Child Name: " + name);
        System.out.println("Parent Name: " + super.name);
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.display();

        /*
        Output:
        Child Name: Dog
        Parent Name: Animal
        */
    }
}
