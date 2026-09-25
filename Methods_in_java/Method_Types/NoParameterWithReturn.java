public class NoParameterWithReturn {

    static int getNumber() {
        return 100;
    }

    public static void main(String[] args) {

        int number = getNumber();

        System.out.println("Number = " + number);
    }
}
