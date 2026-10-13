interface Vehicle {

    // Abstract Method
    void start();

    // Default Method
    default void stop() {
        System.out.println("Vehicle is stopping.");
    }

    // Static Method
    static void display() {
        System.out.println("Vehicle Interface.");
    }
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.start();
        c1.stop();

        Vehicle.display();

        /*
        Output:
        Car is starting.
        Vehicle is stopping.
        Vehicle Interface.
        */
    }
}
