package mypackage.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        // List<String> strings = new LinkedList<>(); // create linklist

        strings.add("John");
        strings.add("Kent");

        strings.set(0, "Brian");

        strings.remove(1);
        System.out.println(strings.get(0));

        for (var string : strings) {
            System.out.println(string);
        }
    }
}
