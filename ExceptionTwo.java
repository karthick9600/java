package project6789;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTwo {
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
            int[] arr = new int[size]; // Possible NegativeArraySizeException

            System.out.println("Enter the index to store the element:");
            int index = scan.nextInt();

            System.out.println("Enter the element to be stored:");
            int ele = scan.nextInt();

            arr[index] = ele; // Possible ArrayIndexOutOfBoundsException
            System.out.println("Element at index " + index + ": " + arr[index]);
        }

        // exception class names
        catch (ArithmeticException ae) {
            System.out.println("Enter a non-zero denominator.");
        }
        catch (NegativeArraySizeException nae) {
            System.out.println("Enter a positive array size.");
        }
        catch (InputMismatchException ime) {
            System.out.println("Enter valid numeric input.");
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Enter an index within array bounds.");
        }
        catch (Exception e) {
            System.out.println("Some problem occurred: " + e);
        }

        System.out.println("Connection is terminated.");
    }
}
