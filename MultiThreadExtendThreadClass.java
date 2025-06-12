package source;

import java.util.Scanner;

class Demo14 extends Thread {
    public void run() {
        System.out.println("Addition activity Start");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a = scan.nextInt();
        System.out.println("Enter the Second Number ");
        int b = scan.nextInt();
        int c = a + b;
        System.out.println("Sum: " + c);
        System.out.println("Addition Activity completed");
    }
}

class Demo15 extends Thread {
    public void run() {
        System.out.println("Character printing activity start");
        for (char i = 65; i <= 75; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Character printing activity ended");
    }
}

class Demo16 extends Thread {
    public void run() {
        System.out.println("Number printing activity start");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Number Printing Activity Completed");
    }
}

public class MultiThreadExtendThreadClass {
    public static void main(String[] args) {
        Demo14 d1 = new Demo14();
        Demo15 d2 = new Demo15();
        Demo16 d3 = new Demo16();

        d1.start();
        d2.start();
        d3.start();
    }
}
