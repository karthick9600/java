package source;

import java.util.Scanner;

class Demo1 {
    void fun1() {
        System.out.println("Connection is established");
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Enter the numerator:");
            int a = scan.nextInt();

            System.out.println("Enter the denominator:");
            int b = scan.nextInt();

            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Some error occurred: " + e);
        }

        System.out.println("Connection is terminated");
    }
}

class Demo2 {
    void fun2() {
        System.out.println("Connection3 is established");
        Demo1 d1 = new Demo1();
        d1.fun1();
        System.out.println("Connection3 is terminated");
    }
}

class Demo3 {
    void fun3() {
        System.out.println("Connection2 is established");
        Demo2 d2 = new Demo2();
        d2.fun2();
        System.out.println("Connection2 is terminated");
    }
}

public class ExceptionFour {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        d3.fun3();
        System.out.println("Main connection is terminated");
    }
}






