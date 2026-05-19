//WAP to check whether the entered amount is  sufficient or not ,if not raise an exception in java
import java.util.Scanner;
public class Practical7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the required amount: ");
        double requiredAmount = sc.nextDouble();
        System.out.print("Enter the available amount: ");
        double availableAmount = sc.nextDouble();

        try {
            if (availableAmount < requiredAmount) {
                throw new InsufficientFundsException("Insufficient funds. Required: " + requiredAmount + ", Available: " + availableAmount);
            } else {
                System.out.println("Sufficient funds. You can proceed with the transaction.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}