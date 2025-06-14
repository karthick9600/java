package sample;

import java.util.ArrayList;

public class CollectionArrayList{

    public static void main(String[] args) {
        int a[] = new int[5];  // fixed size

        ArrayList<Integer> alist = new ArrayList<Integer>(); // flexible

        for (int i = 1; i <= 10; i++) {
            alist.add(i); // i is valid inside the loop
        }

        // If you want to add additional elements after loop
        alist.add(100);
        alist.add(100);
        alist.add(100);
        alist.add(100);

        System.out.println(alist); // prints alist elements

        // Heterogeneous list (not recommended, but possible)
        ArrayList<Object> slist = new ArrayList<Object>();
        slist.add("AAA");
        slist.add(10);
        slist.add('Z');

        System.out.println(slist); // optional: print to verify
    }
}
