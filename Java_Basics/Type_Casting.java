class TypeCasting {
    public static void main(String[] args) {

        // Widening Casting
        int number = 100;
        double decimal = number;

        System.out.println("Widening Casting: " + decimal);

        // Narrowing Casting
        double value = 99.99;
        int convertedValue = (int) value;

        System.out.println("Narrowing Casting: " + convertedValue);
    }
}

/*
Output:
Widening Casting: 100.0
Narrowing Casting: 99
*/
