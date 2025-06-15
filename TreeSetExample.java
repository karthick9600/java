package example;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<Integer>();
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(15);
        set.add(25);

        System.out.println(set);              // [5, 10, 15, 20, 25]
        System.out.println(set.first());      // 5
        System.out.println(set.last());       // 25
        System.out.println(set.headSet(20));  // [5, 10, 15] - strictly less than 20
        System.out.println(set.tailSet(15));  // [15, 20, 25] - 15 and greater
    }
}
