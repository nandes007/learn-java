package mypackage.collection;

import mypackage.collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("John");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby: person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Nothing"); // Error if list immutable
    }
}
