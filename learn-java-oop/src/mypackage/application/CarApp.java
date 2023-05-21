package mypackage.application;

import mypackage.data.*;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Tesla();

        car.drive();
        System.out.println(car.getTier());
    }
}
