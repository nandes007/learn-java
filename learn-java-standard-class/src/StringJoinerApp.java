import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(" || ", "[", "]");

        joiner.add("Jhon");
        joiner.add("Ken");
        joiner.add("Wick");

        String value = joiner.toString();
        System.out.println(value);
    }
}
