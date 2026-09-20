public class ReturnInt {

    static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {

        int result = square(5);

        System.out.println("Square = " + result);
    }
}
