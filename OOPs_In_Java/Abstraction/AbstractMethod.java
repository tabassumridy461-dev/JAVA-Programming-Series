abstract class Shape {

    // Abstract Method
    abstract void draw();
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();

        c1.draw();
        r1.draw();

        /*
        Output:
        Drawing a Circle.
        Drawing a Rectangle.
        */
    }
}
