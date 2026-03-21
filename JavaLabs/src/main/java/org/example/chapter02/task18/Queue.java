package org.example.chapter02.task18;

import java.util.NoSuchElementException;

class Queue {
    private static class Node {
        final private String data;
        private Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
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

    public class Iterator {
        private Node current;
        private int position;

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

    public Iterator iterator() {
        return new Iterator();
    }
}
