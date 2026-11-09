
import java.io.IOException;

public class ThrowsKeyword {

    // Declaring an exception using throws
    static void checkFile() throws IOException {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {

        try {
            checkFile();
        }
        catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}

/*
Output:
Exception handled: File not found!
*/
