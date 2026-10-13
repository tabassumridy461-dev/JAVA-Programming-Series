class Animal {

    // Protected Variable
    protected String name = "Dog";

    // Protected Method
    protected void display() {
        System.out.println("Animal Name: " + name);
    }
}

class Protected {

    public static void main(String[] args) {

        Animal a1 = new Animal();

        System.out.println("Name: " + a1.name);
        a1.display();

        /*
        Output:
        Name: Dog
        Animal Name: Dog
        */
    }
}
