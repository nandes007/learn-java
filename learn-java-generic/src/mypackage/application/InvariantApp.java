package mypackage.application;

import mypackage.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("John");
        // Error because generic type is invariant
        // doIt(stringMyData); // Error
        // MyData<Object> objectMyData = stringMyData; // ERROR
    }

    public static void doIt(MyData<Object> objectMyData) {
        // implement
    }
}
