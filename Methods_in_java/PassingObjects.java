public class PassingObjects {

    int number;

    static void change(PassingObjects obj) {
        obj.number = 100;
    }

    public static void main(String[] args) {

        PassingObjects obj = new PassingObjects();

        obj.number = 50;

        System.out.println("Before: " + obj.number);

        change(obj);

        System.out.println("After: " + obj.number);
    }
}
