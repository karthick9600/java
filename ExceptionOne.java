package project6789;

import java.util.Scanner;

public class ExceptionOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        try {
            System.out.println("Enter the Numerator:");
            int a = scan.nextInt();

            System.out.println("Enter the Denominator:");
            int b = scan.nextInt();

            int c = a / b; // Possible ArithmeticException
            System.out.println("Result of division: " + c);

            System.out.println("Enter the size of array:");
            int size = scan.nextInt();
            int[] arr = new int[size];

            System.out.println("Enter the index to store the element:");
            int index = scan.nextInt();

            System.out.println("Enter the element to be stored:");
            int ele = scan.nextInt();

            arr[index] = ele; // Possible ArrayIndexOutOfBoundsException
            System.out.println("Element at index " + index + ": " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Some unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Connection is terminated");
            scan.close();
        }
    }
}
