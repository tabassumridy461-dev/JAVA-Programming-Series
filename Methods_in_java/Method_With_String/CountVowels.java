public class CountVowels {

    // Method counts the number of vowels in a String
    static int countVowels(String text) {

        int count = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String text = "I love Java";

        int result = countVowels(text);

        System.out.println("Number of vowels: " + result);
    }
}

/*
Output:
Number of vowels: 5
*/
