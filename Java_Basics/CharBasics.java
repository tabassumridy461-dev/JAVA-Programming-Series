public class CharBasics {

    public static void main(String[] args) {

        char letter = 'A';
        char digit = '5';
        char symbol = '@';

        System.out.println("Letter: " + letter);
        System.out.println("Digit: " + digit);
        System.out.println("Symbol: " + symbol);

        char first = 'A';
        char second = 'B';

        System.out.println("First Character: " + first);
        System.out.println("Second Character: " + second);

        int asciiValue = 'A';

        System.out.println("ASCII Value of A: " + asciiValue);

        char nextCharacter = (char) (letter + 1);

        System.out.println("Next Character: " + nextCharacter);
    }

    /*
    Output:
    Letter: A
    Digit: 5
    Symbol: @
    First Character: A
    Second Character: B
    ASCII Value of A: 65
    Next Character: B
    */
}
