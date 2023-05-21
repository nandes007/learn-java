public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("Add");
        manager.sayHello("Joko");

        var vp = new VicePresident("Edward");
        vp.sayHello("Boaz");
    }
}
