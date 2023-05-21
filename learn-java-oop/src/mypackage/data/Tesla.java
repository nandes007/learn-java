package mypackage.data;

public class Tesla implements Car {
    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public String getBrand() {
        return "Tesla";
    }

    @Override
    public void drive() {
        System.out.println("Tesla drive");
    }

    @Override
    public int getTier() {
        return 4;
    }
}
