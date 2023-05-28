package mypackage.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();

        map.put("John", "John");
        map.put("Kent", "Kent");
        map.put("Wick", "Wick");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
