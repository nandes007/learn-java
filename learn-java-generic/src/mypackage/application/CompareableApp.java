package mypackage.application;

import mypackage.generic.Person;

import java.util.Arrays;

public class CompareableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("John", "US"),
                new Person("Kent", "Japan"),
                new Person("Wick", "Singapore")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
