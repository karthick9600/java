package source;


import java.util.InputMismatchException;
import java.util.Scanner;

// Custom Exception
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class AdvancedExceptionHandling {
    
    // Method that can throw multiple exceptions
    static void processUser(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age is below 18, access denied.");
        } else {
            System.out.println("Access granted. Welcome!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            try {
                // Getting user input
                System.out.print("Enter numerator: ");
                int a = scanner.nextInt();

                System.out.print("Enter denominator: ");
                int b = scanner.nextInt();

                // ArithmeticException
                int result = a / b;
                System.out.println("Result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero.");
            }

            // Second level exception
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            processUser(age);  // May throw InvalidAgeException

        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Input Error: Please enter numbers only.");

        } catch (Exception e) {
            // General catch block
            System.out.println("General Exception: " + e);

        } finally {
            // Always executed
            System.out.println("Closing resources...");
            scanner.close();
        }

        System.out.println("Program completed.");
    }
}
