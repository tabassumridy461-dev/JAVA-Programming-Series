
public class StringComparison {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";

        // Comparing Strings (case-sensitive)
        System.out.println(str1.equals(str2));

        // Comparing Strings (case-insensitive)
        System.out.println(str1.equalsIgnoreCase(str3));

        // Comparing Strings using ==
        System.out.println(str1 == str2);

        // Output:
        // true
        // true
        // true

    }
}
