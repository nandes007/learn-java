package mypackage.application;

import mypackage.generic.MyData;

public class TypeErrasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("John");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
