package mypackage.application;

import mypackage.generic.MyData;
import mypackage.generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("John", 10);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
