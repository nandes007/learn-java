package mypackage.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("John");
        stack.offerLast("Wick");
        stack.offerLast("Kent");

//        for (var value : deque) {
//            System.out.println(value);
//        }

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();
        queue.offerLast("John");
        queue.offerLast("Wick");
        queue.offerLast("Kent");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
    }
}
