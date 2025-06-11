package source;

import java.util.Scanner;

class Demo {
    public void addNumbers() {
        System.out.println("Adding function is started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int a = scan.nextInt();
        System.out.println("Enter the second Number:");
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("Sum: " + c);
        System.out.println("Adding function completed");
    }

    public void printCharacters() {
        System.out.println("Printing Characters is started");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Printing Characters is completed");
    }

    public void printNumbers() {
        System.out.println("Printing numbers is started");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Printing numbers is completed");
    }
}

public class MultiThreadingExamples {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.addNumbers();
        d.printCharacters();
        d.printNumbers();
    }
}
