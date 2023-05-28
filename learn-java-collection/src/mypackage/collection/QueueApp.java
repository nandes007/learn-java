package mypackage.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        Queue<String> sortQueue = new PriorityQueue<>();
        Queue<String> linkListQueue = new LinkedList<>();

        queue.add("Wick");
        queue.add("John");
        queue.add("Kent");

        sortQueue.add("Wick");
        sortQueue.add("John");
        sortQueue.add("Kent");

        linkListQueue.add("Wick");
        linkListQueue.add("John");
        linkListQueue.add("Kent");

        System.out.println("Queue (below)");
        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
        }

        System.out.println("Sort (below)");
        for (String next = sortQueue.poll(); next != null; next = sortQueue.poll()) {
            System.out.println(next);
        }

        System.out.println("Link list (below)");
        for (String next = linkListQueue.poll(); next != null; next = linkListQueue.poll()) {
            System.out.println(next);
        }

        System.out.println(queue.size());
    }
}
