package sample;

class Printer implements Runnable {

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Start printing");

        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " is printing page " + i);

            try {
                Thread.sleep(4000); // Sleep for 4 seconds
            } catch (Exception e) {
                System.out.println("Some problem occurred");
            }
        }

        System.out.println(name + " printing completed");
    }
}

public class MultiThreadSingleThreadApproach {

    public static void main(String[] args) {
        Printer p = new Printer();

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
