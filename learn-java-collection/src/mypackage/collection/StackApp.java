package mypackage.collection;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("John");
        stack.push("Kent");
        stack.push("Wick");

        try {
            for (var value = stack.pop(); value != null; value = stack.pop()) {
                System.out.println(value);
            }
        } catch (EmptyStackException $exception) {
            System.out.println($exception);
        }
    }
}
