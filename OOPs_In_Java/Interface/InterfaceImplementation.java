interface Shape {

    void draw();
    void calculateArea();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }

    @Override
    public void calculateArea() {
        double radius = 5;
        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();

        c1.draw();
        c1.calculateArea();

        /*
        Output:
        Drawing a Circle.
        Area of Circle: 78.53981633974483
        */
    }
}
