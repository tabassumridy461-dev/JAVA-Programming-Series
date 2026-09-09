class AssignmentOperators {
    public static void main(String[] args) {

        int x = 10;

        System.out.println("Initial value: " + x);

        x += 5;
        System.out.println("After += 5: " + x);

        x -= 3;
        System.out.println("After -= 3: " + x);

        x *= 2;
        System.out.println("After *= 2: " + x);

        x /= 4;
        System.out.println("After /= 4: " + x);

        x %= 3;
        System.out.println("After %= 3: " + x);
    }
}

/*
Output:
Initial value: 10
After += 5: 15
After -= 3: 12
After *= 2: 24
After /= 4: 6
After %= 3: 0
*/
