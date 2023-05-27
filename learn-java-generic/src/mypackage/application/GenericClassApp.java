package mypackage.application;

import mypackage.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("John");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());
    }
}
