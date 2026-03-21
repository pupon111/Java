/*
Implement a class Queue, an unbounded queue of strings. Provide methods add,
adding at the tail, and remove, removing at the head of the queue. Store elements as
a linked list of nodes. Make Node a nested class. Should it be static or not?
 */
package org.example.chapter02.task17;

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

    private Node head;
    private Node tail;
    private int size;

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
        size++;
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
}

