// Java program to illustrate
// Heap error
package source;

import java.util.*;

public class  OutOfMemoryHeap {
    static List<String> list = new ArrayList<String>();

    public static void main(String args[]) throws Exception
    {
        Integer[] array = new Integer[10000 * 10000];
    }
}