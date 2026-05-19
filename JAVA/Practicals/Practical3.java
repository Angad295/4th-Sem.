//WAP to perform manipulation on strings in java.
import java.util.Scanner;
public class Practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // Convert to uppercase
        String upperCaseString = inputString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        // Convert to lowercase
        String lowerCaseString = inputString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);

        // Length of the string
        int length = inputString.length();
        System.out.println("Length: " + length);

        // Substring
        if (length >= 5) {
            String substring = inputString.substring(0, 5);
            System.out.println("Substring (first 5 characters): " + substring);
        } else {
            System.out.println("Input string is too short for substring operation.");
        }

        // Replace spaces with underscores
        String replacedString = inputString.replace(' ', '_');
        System.out.println("Replaced String: " + replacedString);

        sc.close();
    }
}