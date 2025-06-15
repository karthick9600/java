package one;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExample {  // Renamed to avoid confusion

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> h = new LinkedHashMap<String, Integer>();
        h.put("India", 1000);
        h.put("China", 900);   // fixed spelling
        h.put("USA", 400);     // assuming you meant "USA"
        h.put("USE", 200);     // keep if intended as a separate key
        h.put("Japan", 200);
        h.put("Korea", 400);

        // Print entire map
        System.out.println("LinkedHashMap contents: " + h);

        // Get and print each entry
        Set<Entry<String, Integer>> entrySet = h.entrySet();
        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
