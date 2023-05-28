package mypackage.collection;

import mypackage.collection.data.Person;
import mypackage.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("John"));
        people.add(new Person("Wick"));
        people.add(new Person("Kent"));

        for (var p : people) {
            System.out.println(p.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add("M"); // Error, cause sorted set have been cast to immutable
    }
}
