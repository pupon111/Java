package org.example.chapter02.task19;

import java.util.NoSuchElementException;

public class Deque {
    private Node head;
    private Node tail;

    public void addLast(int data) {
        Node node = new Node(data);

        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
    }

    @SuppressWarnings("unused")
    public void addFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
        }

        head = node;
    }

    public void removeLast() {
        if (tail == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        tail = tail.prev;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
    }

    public void removeFirst() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int peekFirst() {
        if (head == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return head.data;
    }

    public int peekLast() {
        if (tail == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return tail.data;
    }

    private static class Node {
        final private int data;
        private Node next;
        private Node prev;

        Node(int data) {
            this.data = data;
        }
    }
}