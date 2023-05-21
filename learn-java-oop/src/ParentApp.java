public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Joko";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
        System.out.println(parent.name);
    }
}
