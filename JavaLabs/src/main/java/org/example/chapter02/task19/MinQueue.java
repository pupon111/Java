package org.example.chapter02.task19;


public class MinQueue {
    private final Deque queue = new Deque();
    private final Deque minDeque = new Deque();

    public void push(int element) {
        queue.addLast(element);

        while (!minDeque.isEmpty() && minDeque.peekLast() > element) {
            minDeque.removeLast();
        }

        minDeque.addLast(element);
    }

    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = queue.peekFirst();
        queue.removeFirst();

        if (!minDeque.isEmpty() && removed == minDeque.peekFirst()) {
            minDeque.removeFirst();
        }

        return removed;
    }

    public int min() {
        if (minDeque.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return minDeque.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}