public class Basic_MethodOverloading {

    static void show() {
        System.out.println("Hello Java!");
    }

    static void show(String name) {
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        show();
        show("Tabassum");
    }
}

/*
Output:
Hello Java!
Hello Tabassum!
*/

