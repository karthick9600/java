package source;

import java.util.Scanner;

public class ExceptionAllStatement {

    public static void main(String[] args) {
        System.out.println("Connection is established");

        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator:");
            int a = scan.nextInt();

            System.out.println("Enter the denominator:");
            int b = scan.nextInt();

            int c = a / b;
            System.out.println("Result of division: " + c);

            System.out.println("Enter the size of Array:");
            int size = scan.nextInt();
            int[] arr = new int[size];  // You forgot to declare and initialize the array

            System.out.println("Enter the element to be stored:");
            int ele = scan.nextInt();

            System.out.println("Enter the index at which the element must be stored:");
            int index = scan.nextInt();

            arr[index] = ele;  // This might throw ArrayIndexOutOfBoundsException
            System.out.println("Element stored at index " + index + ": " + arr[index]);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }

        System.out.println("Connection is terminated");
        scan.close();
    }
}
