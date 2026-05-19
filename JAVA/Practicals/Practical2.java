//WAP to demonstrate wrapper classes in java
import java.util.Scanner;
public class Practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Using Integer wrapper class
        Integer wrappedNum = Integer.valueOf(num);
        System.out.println("Wrapped Integer: " + wrappedNum);

        // Using Double wrapper class
        System.out.print("Enter a double: ");
        double doubleNum = sc.nextDouble();
        Double wrappedDouble = Double.valueOf(doubleNum);
        System.out.println("Wrapped Double: " + wrappedDouble);

        // Using Character wrapper class
        System.out.print("Enter a character: ");
        char charInput = sc.next().charAt(0);
        Character wrappedChar = Character.valueOf(charInput);
        System.out.println("Wrapped Character: " + wrappedChar);

        sc.close();
    }
}