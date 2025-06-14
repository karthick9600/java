package sample;

import java.util.*; // ✅ Correct import
import java.util.HashSet;

/*
 * Set - only unique elements
 * HashSet - uses hashing to store elements
 */
public class Set {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();   //  Using in a LinedList also but this order the data but no Redundancy 
    //Tree set using in  Alpha  Orderwise  store the data
        h.add("AA");
        h.add("kk1B");
        h.add("oo2C");
        h.add("qqkD");
        h.add("AAA"); // Duplicate, will be ignored

        System.out.println(h); // Output: Unordered, unique values only
    }
}
