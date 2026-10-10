
public class MultipleObjects {

    String name;
    int age;

    public static void main(String[] args) {

        MultipleObjects obj1 = new MultipleObjects();
        obj1.name = "Tabassum";
        obj1.age = 22;

        MultipleObjects obj2 = new MultipleObjects();
        obj2.name = "Ridy";
        obj2.age = 23;

        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);

        System.out.println("Name: " + obj2.name);
        System.out.println("Age: " + obj2.age);
    }
}

// Output:
// Name: Tabassum
// Age: 22
// Name: Ridy
// Age: 23
