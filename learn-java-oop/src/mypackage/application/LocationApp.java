package mypackage.application;

import mypackage.data.City;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.name = "Soul";
        System.out.println(city.name);
    }
}
