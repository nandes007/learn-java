package mypackage.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("John");
        collection.add("Kent");
        collection.add("Wick");
        collection.addAll(List.of("Bigboss", "Tech", "Corp"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("Remove : (below)");

        collection.remove("John");
        collection.removeAll(List.of("Bigboss", "Corp"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Tech"));
        System.out.println(collection.contains(List.of("Kent", "Bigboss")));
    }
}
