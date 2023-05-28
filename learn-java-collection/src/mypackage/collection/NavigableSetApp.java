package mypackage.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("John", "Kent", "Wick", "Bigboss", "Corp"));

        NavigableSet<String> namesReverse = names.descendingSet();
        NavigableSet<String> kent = names.headSet("Kent", true);

        for (var name : kent) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Test add"); // Error, cause have been cast to immutable
    }
}
