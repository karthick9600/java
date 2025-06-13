package sample;

class Queue {
    int x;
    boolean valueSet = false;

    // Producer-ன் method
    synchronized void store(int j) {
        while (valueSet) {
            try {
                wait(); // Already value set - wait
            } catch (Exception e) {
            }
        }
        x = j;
        System.out.println("Produced: " + x);
        valueSet = true;
        notify(); // Consumer-க்கு சொல்லு
    }

    // Consumer-ன் method
    synchronized void retrieve() {
        while (!valueSet) {
            try {
                wait(); // No value yet - wait
            } catch (Exception e) {
            }
        }
        System.out.println("Consumed: " + x);
        valueSet = false;
        notify(); // Producer-க்கு சொல்லு
    }
}

class Producer extends Thread {
    Queue q;

    public Producer(Queue q) {
        this.q = q;
    }

    public void run() {
        int i = 1;
        while (true) {
            q.store(i++);
            try {
                Thread.sleep(1000); // Delay
            } catch (Exception e) {
            }
        }
    }
}

class Consumer extends Thread {
    Queue q;

    public Consumer(Queue q) {
        this.q = q;
    }

    public void run() {
        while (true) {
            q.retrieve();
            try {
                Thread.sleep(1000); // Delay
            } catch (Exception e) {
            }
        }
    }
}

public class ConsumerProducer {
    public static void main(String[] args) {
        Queue q = new Queue();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        p.start();
        c.start();
    }
}
