package example;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(3);
        pq.add(7);
        pq.add(1);

        System.out.println(pq);      // Output order may vary, but smallest is at the head
        int min = pq.remove();       // Removes the smallest element (1)
        System.out.println(min);     // 1
        System.out.println(pq);      // Remaining elements, head is now the next smallest
    }
}
