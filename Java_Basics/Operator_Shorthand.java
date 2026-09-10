public class OperatorShorthand {

    public static void main(String[] args) {

        int a = 10;

        a += 5;
        System.out.println("After += : " + a);

        a -= 3;
        System.out.println("After -= : " + a);

        a *= 2;
        System.out.println("After *= : " + a);

        a /= 4;
        System.out.println("After /= : " + a);

        a %= 3;
        System.out.println("After %= : " + a);
    }

    /*
    Output:
    After += : 15
    After -= : 12
    After *= : 24
    After /= : 6
    After %= : 0
    */
}
