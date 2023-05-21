class Person {
    String name;
    String address;
    final String country = "Indonesia";

    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    Person(String paramName) {
        this(paramName, null);
    }

    Person() {
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", My Name is " + this.name);
    }
}
