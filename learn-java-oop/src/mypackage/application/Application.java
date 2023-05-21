package mypackage.application;

import mypackage.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro M2", 25000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}
