/*
Provide an iterator—an object that yields the elements of the queue in turn—for the
queue of the preceding class. Make Iterator a nested class with methods next and
hasNext. Provide a method iterator() of the Queue class that yields a Queue.Iterator.
Should Iterator be static or not?
 */
package org.example.chapter02.task18;

import java.util.NoSuchElementException;

public class Queue {

    private static class Node {
        final private String data;
        private Node next;

        private Node(String data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return data;
        }
    }
    private int position = 0;
    public class Iterator {
        private Node current;
        private int position = Queue.this.position;

        private Iterator() {
            this.current = head;
            this.position = 0;
        }

        public boolean hasNext() {
            return current != null && position < size;
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements in the queue");
            }
            String data = current.data;
            current = current.next;
            position++;
            return data;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void push(String element) {
        if (element == null) {
            throw new IllegalArgumentException("Cannot add null element");
        }
        Node newNode = new Node(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        this.size++;
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return "";
        }
        String removedData = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return removedData;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Iterator iterator() {
        return new Iterator();
    }
}
