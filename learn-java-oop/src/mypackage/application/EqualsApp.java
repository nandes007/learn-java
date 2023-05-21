package mypackage.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Joko";
        first = first + " " + "Tingkir";
        System.out.println(first);

        String second = "Joko Tingkir";
        System.out.println(second);
        System.out.println(first.equals(second));

        String third = "Joko Tingkir";
        System.out.println(third);
        System.out.println(second.equals(third));
    }
}
