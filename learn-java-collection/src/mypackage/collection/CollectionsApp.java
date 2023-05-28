package mypackage.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("John", "Kent", "Wick", "Bigboss", "Corp"));

        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
