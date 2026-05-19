//WAP to demonstrate Exception handling in java
import java.util.Scanner;
public class Practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            int result = 100 / num; // This may throw ArithmeticException if num is 0
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            System.out.println("This block will always execute.");
        }

        sc.close();
    }
}