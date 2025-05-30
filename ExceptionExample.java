package project6789;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        try {
            // Input two integers
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Attempt division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception e) {
            // Handle other input errors
            System.out.println("Error: Invalid input.");
        } finally {
            // Always runs
            System.out.println("Program finished.");
            scanner.close();
        }
    }
}
