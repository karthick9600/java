package source;



import java.util.Scanner;

class Demo17 implements Runnable {
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

class Demo18 implements Runnable {
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

class Demo19 implements Runnable {
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

public class MultiThreadImplementsRunnable {
    public static void main(String[] args) {
        // Create Runnable objects
        Runnable r1 = new Demo17();
        Runnable r2 = new Demo18();
        Runnable r3 = new Demo19();

        // Pass Runnable objects to Thread
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}
