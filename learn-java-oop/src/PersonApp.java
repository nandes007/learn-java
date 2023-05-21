public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Jhon", "Unkwown");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Joko");

        Person person2 = new Person("Adrew");

        Person person3;
        person3 = new Person();
        person3.name = "Jaki";
        person3.sayHello("Jaka");
    }
}
