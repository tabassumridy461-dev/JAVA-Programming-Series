// Final Class
final class Vehicle {

    void display() {
        System.out.println("This is a Vehicle.");
    }
}

class FinalClass {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        v1.display();

        /*
        Output:
        This is a Vehicle.
        */
    }
}
