public class PassByValue {

    // Method receives a copy of the value
    static void changeValue(int number) {
        number = 100;
        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int number = 50;

        System.out.println("Before method call: " + number);

        changeValue(number);

        System.out.println("After method call: " + number);
    }
}

/*Output
Before method call: 50
Inside method: 100
After method call: 50 */
