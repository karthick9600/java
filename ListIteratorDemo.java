package sample;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {  // ✅ Renamed class

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // Obtain a ListIterator object to traverse the list
        ListIterator<String> iterator = list.listIterator();

        // Traverse the list in forward direction
        System.out.println("Forward direction to print elements and their index:");
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
            System.out.println("Next Index: " + iterator.nextIndex());
        }

        // Traverse the list in reverse direction
        System.out.println("\nReverse direction to print elements and their index:");
        while (iterator.hasPrevious()) {
            System.out.println("Element: " + iterator.previous());
            System.out.println("Previous Index: " + iterator.previousIndex());
        }

        // Modify the list using the iterator
        iterator = list.listIterator(); // Reset the iterator
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove(); // Remove the current element
            } else if (fruit.equals("cherry")) {
                iterator.set("grape"); // Replace current element
            } else if (fruit.equals("apple")) {
                iterator.add("orange"); // Add a new element after current
            }
        }

        // Print the modified list
        System.out.println("\nModified list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
