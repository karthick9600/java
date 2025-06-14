package sample;

import java.util.ArrayList;
import java.util.Iterator;  // ✅ Import Iterator

public class SampleIterator {  // ✅ Changed class name

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Bob")) {
                iterator.remove();  // ✅ Safe removal during iteration
            }
        }

        System.out.println(names);  // Output: [Alice, Charlie]
    }
}
