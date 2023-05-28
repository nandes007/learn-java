package mypackage.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "John");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "John");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "John",
                "middle", "Kent",
                "last", "Wick"
        );
    }
}
