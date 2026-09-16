// ArraySearch.java

public class ArraySearch {

    public static void main(String[] args) {

        // Create and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Value we want to search for
        int searchValue = 30;

        // Variable to check whether the value is found
        boolean found = false;

        // Search through the array
        for (int i = 0; i < numbers.length; i++) {

            // Check if current element matches search value
            if (numbers[i] == searchValue) {

                System.out.println("Value found at index: " + i);

                // Value has been found
                found = true;

                // Stop the loop
                break;
            }
        }

        // If value was not found
        if (!found) {
            System.out.println("Value not found.");
        }
    }
}
