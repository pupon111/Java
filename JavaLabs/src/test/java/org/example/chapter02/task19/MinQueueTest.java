package org.example.chapter02.task19;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MinQueueTest {

    @Test
    void pushShouldUpdateMin() {
        MinQueue queue = new MinQueue();

        queue.push(5);
        assertEquals(5, queue.min());

        queue.push(3);
        assertEquals(3, queue.min());

        queue.push(7);
        assertEquals(3, queue.min());

        queue.push(1);
        assertEquals(1, queue.min());
    }

    @Test
    void pushShouldPreserveOrder() {
        MinQueue queue = new MinQueue();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        assertEquals(10, queue.pop());
        assertEquals(20, queue.pop());
        assertEquals(30, queue.pop());
    }

    @Test
    void popFromNonEmptyQueue() {
        MinQueue queue = new MinQueue();

        queue.push(5);
        queue.push(3);
        queue.push(8);

        assertEquals(5, queue.pop());
        assertEquals(3, queue.pop());
        assertEquals(8, queue.pop());
    }

    @Test
    void popShouldUpdateMin() {
        MinQueue queue = new MinQueue();

        queue.push(5);
        queue.push(2);
        queue.push(8);
        queue.push(1);

        assertEquals(1, queue.min());
        assertEquals(5, queue.pop());
        assertEquals(1, queue.min());
        assertEquals(2, queue.pop());
        assertEquals(1, queue.min());
    }

    @Test
    void popFromEmptyQueue() {
        MinQueue queue = new MinQueue();

        assertThrows(NoSuchElementException.class, queue::pop);
    }

    @Test
    void minOnNonEmptyQueue() {
        MinQueue queue = new MinQueue();

        queue.push(10);
        assertEquals(10, queue.min());

        queue.push(5);
        assertEquals(5, queue.min());

        queue.push(3);
        assertEquals(3, queue.min());

        queue.push(7);
        assertEquals(3, queue.min());
    }

    @Test
    void minShouldUpdateAfterPop() {
        MinQueue queue = new MinQueue();

        queue.push(2);
        queue.push(5);
        queue.push(3);
        queue.push(8);


        assertEquals(2, queue.min());
        queue.pop();
        assertEquals(3, queue.min());
        queue.pop();
        assertEquals(3, queue.min());
        queue.pop();
        assertEquals(8, queue.min());
    }

    @Test
    void minOnEmptyQueue() {
        MinQueue queue = new MinQueue();

        assertThrows(NoSuchElementException.class, queue::min);
    }

    @Test
    void isEmptyOnNewQueue() {
        MinQueue queue = new MinQueue();

        assertTrue(queue.isEmpty());
    }

    @Test
    void isEmptyAfterPush() {
        MinQueue queue = new MinQueue();

        queue.push(5);
        assertFalse(queue.isEmpty());
    }

    @Test
    void isEmptyAfterPopAll() {
        MinQueue queue = new MinQueue();

        queue.push(5);
        queue.push(3);
        queue.pop();
        queue.pop();

        assertTrue(queue.isEmpty());
    }
}