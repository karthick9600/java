package sample;

class Demo1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("User thread executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some problem occurred");
            }
        }
        System.out.println("User thread completed");
    }
}

class Demo2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some problem occurred");
            }
        }
    }
}

public class UserAndDaemonThread {

    public static void main(String[] args) throws Exception {
        System.out.println("Main() started execution");

        Demo1 d1 = new Demo1(); // user thread
        Demo2 d2 = new Demo2(); // daemon thread

        d2.setDaemon(true); // Set BEFORE start() is called

        d1.start();
        d2.start();

        System.out.println("Main() completed execution");
    }
}
