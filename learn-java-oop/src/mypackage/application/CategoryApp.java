package mypackage.application;

import mypackage.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();
        category.setId("01");
        category.setId(null);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
