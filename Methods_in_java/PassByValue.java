public class PassByValue {

    static void change(int number) {
        number = 100;
        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int number = 50;

        change(number);

        System.out.println("Outside method: " + number);
    }
}
