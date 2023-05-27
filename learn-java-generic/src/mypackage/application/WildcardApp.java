package mypackage.application;

import mypackage.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<>(100));
        print(new MyData<>("John"));
        print(new MyData<>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
