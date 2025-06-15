package one;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapExample {  // Renamed to avoid conflict with java.util.HashMap

    public static void main(String[] args) {
        // Create a new HashMap and add some key-value pairs to it
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("India", 1000);
        h.put("China", 900);
        h.put("USA", 400);
        h.put("Japan", 200);
        h.put("Korea", 400);

        // Print the HashMap
        System.out.println("HashMap contents: " + h);

        // Get the set of key-value pairs from the HashMap
        Set<Map.Entry<String, Integer>> entrySet = h.entrySet();
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
