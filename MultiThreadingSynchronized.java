package sample;

class Printers implements Runnable {
      synchronized public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Start printing");

        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is printing page " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some Problem Occurred");
            }
        }

        System.out.println(name + " Printing completed");
    }
}

public class MultiThreadingSynchronized {
    public static void main(String[] args) throws Exception {
        Printers p = new Printers();

        // Use Thread class to create threads with the Runnable object
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(p);

        t1.setName("MEN");
        t2.setName("WOMEN");
        t3.setName("CHILD");

        t1.start();
        t2.start();
        t3.start();
    }
}
