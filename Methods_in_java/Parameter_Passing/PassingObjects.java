public class PassingObjects {

    int value;

    // Constructor
    PassingObjects(int value) {
        this.value = value;
    }

    // Method receives an object
    static void changeValue(PassingObjects obj) {
        obj.value = 100;
    }

    public static void main(String[] args) {

        PassingObjects object = new PassingObjects(50);

        System.out.println("Before method call: " + object.value);

        changeValue(object);

        System.out.println("After method call: " + object.value);
    }
}

/*
Output:
Before method call: 50
After method call: 100
*/
