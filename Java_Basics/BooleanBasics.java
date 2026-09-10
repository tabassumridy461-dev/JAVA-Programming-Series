public class BooleanBasics {

    public static void main(String[] args) {

        boolean isJavaEasy = true;
        boolean isPythonDifficult = false;

        System.out.println("Is Java Easy? " + isJavaEasy);
        System.out.println("Is Python Difficult? " + isPythonDifficult);

        int age = 20;

        boolean isAdult = age >= 18;
        System.out.println("Is Adult? " + isAdult);

        boolean result1 = 10 > 5;
        boolean result2 = 10 < 5;
        boolean result3 = 10 == 10;

        System.out.println("10 > 5: " + result1);
        System.out.println("10 < 5: " + result2);
        System.out.println("10 == 10: " + result3);
    }

    /*
    Output:
    Is Java Easy? true
    Is Python Difficult? false
    Is Adult? true
    10 > 5: true
    10 < 5: false
    10 == 10: true
    */
}
