package mypackage.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("John", "John");
        map.put("Kent", "Kent");
        map.put("Wick", "Wick");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Kent"));
        System.out.println(map.higherKey("Kent"));
        System.out.println(map.floorKey("Kent"));
        System.out.println(map.ceilingKey("Kent"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("test", "test");
    }
}
