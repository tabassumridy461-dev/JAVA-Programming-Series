interface Printable {

    void print();
}

interface Showable {

    void show();
}

class MultipleInterfaces implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("Printing document.");
    }

    @Override
    public void show() {
        System.out.println("Showing document.");
    }

    public static void main(String[] args) {

        MultipleInterfaces obj = new MultipleInterfaces();

        obj.print();
        obj.show();

        /*
        Output:
        Printing document.
        Showing document.
        */
    }
}
