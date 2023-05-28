package mypackage.collection;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();

        list.add("John");
        list.add("Kent");
        list.add("Wick");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
