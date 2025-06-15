package one;


import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<String, Integer> quantity = new  TreeMap<>();

        
        quantity.put("Orange", 20);
        quantity.put("Papaya", 100);
        
        quantity.put("Apple", 10);

        // Print all key-value pairs
        System.out.println("Before removing Orange:");
        for (String key : quantity.keySet()) {
            System.out.println(key + " -> " + quantity.get(key));
        }

        // Remove an entry
        quantity.remove("Orange");  // ✅ Corrected syntax

        // Print again after removal
        System.out.println("\nAfter removing Orange:");
        for (String key : quantity.keySet()) {
            System.out.println(key + " -> " + quantity.get(key));
        }
        
        
        quantity.put("Apple",quantity.get("Apple")+10);
        
        
        for(String key:quantity.keySet()) {
        	System.out.println(key+"->"+quantity.get(key));
        }
        
        
        System.out.println(quantity.containsKey("Apple"));
        System.out.println(quantity.containsKey("Dragon Fruits"));
        
    }
    
  
}









