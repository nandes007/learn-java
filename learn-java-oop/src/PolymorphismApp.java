public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Jhon");
        employee.sayHello("Jaka");

        employee = new Manager("Rudi");
        employee.sayHello("Dodit");

        employee = new VicePresident("Jojo");
        employee.sayHello("George");

        sayHello(new Employee("Jhon"));
        sayHello(new Manager("Diki"));
        sayHello(new VicePresident("Diko"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hellp VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
