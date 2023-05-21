package mypackage.application;

import static mypackage.data.Application.PROCESSORS;
import static mypackage.data.Constant.*;
import mypackage.data.Country;
import mypackage.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(MathUtil.sum(1, 2, 3, 4, 5, 6, 7, 8));

        Country.City city = new Country.City();
        city.setName("Unknown");
        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
