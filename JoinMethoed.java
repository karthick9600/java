package sample;

class Demo11 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("JAVA");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("oo---");
            }
        }
    }
}

public class JoinMethoed {

    public static void main(String[] args) {
        System.out.println("Main thread started");
        Demo11 d = new Demo11();
        d.start();

        try {
            d.join();  // Wait for Demo11 thread to complete
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread completed");
    }
}
