package sample;

import java.util.PriorityQueue;
import java.util.Queue;

// PriorityQueue - Elements are ordered by natural ordering (for Integer: smallest value has the highest priority)
public class QueueDemo {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>(); // PriorityQueue implements Queue

        q.add(3);
        q.add(10);
        q.add(1);
        q.add(8);

        System.out.println("Head is " + q.peek()); // Shows the head element
        System.out.println("Removed is " + q.remove()); // Removes the head element
        System.out.println("New Head is " + q.peek());
        System.out.println("Current size is " + q.size());
    }
}
