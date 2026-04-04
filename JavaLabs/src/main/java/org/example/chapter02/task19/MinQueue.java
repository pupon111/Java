package org.example.chapter02.task19;

import java.util.NoSuchElementException;

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
            throw new NoSuchElementException("Queue is empty");
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
            throw new NoSuchElementException("Queue is empty");
        }
        return minDeque.peekFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}