package mypackage.collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("John", "Kent", "Wick");
        for (var name : names) {
            System.out.println(name);
        }

        System.out.println("ITERATOR : (below)");
        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
