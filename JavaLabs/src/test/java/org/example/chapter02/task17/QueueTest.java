package org.example.chapter02.task17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void push() {
        Queue queue = new Queue();
        String element = "First";

        queue.push(element);

        assertEquals(1, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    void pushMultipleElements() {
        Queue queue = new Queue();

        queue.push("First");
        queue.push("Second");
        queue.push("Third");

        assertEquals(3, queue.size());
        assertFalse(queue.isEmpty());
    }

    @Test
    void pushNullElement() {
        Queue queue = new Queue();
        
        assertThrows(IllegalArgumentException.class, () -> queue.push(null));
        assertEquals(0, queue.size());
    }

    @Test
    void pushEmptyString() {
        Queue queue = new Queue();
        queue.push("");
        assertEquals(1, queue.size());
    }

    @Test
    void pop() {
        Queue queue = new Queue();
        queue.push("Element");
        String result = queue.pop();
        assertEquals("Element", result);
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    void popFromEmptyQueue() {
        Queue queue = new Queue();
        String result = queue.pop();
        assertEquals("", result);
        assertEquals(0, queue.size());
        assertTrue(queue.isEmpty());
    }

    @Test
    void popAfterPushAndPop() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.pop();
        String result = queue.pop();
        assertEquals("Second", result);
        assertEquals(0, queue.size());
    }

    @Test
    void isEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.size());
    }

    @Test
    void isEmptyAfterPush() {
        Queue queue = new Queue();
        queue.push("Element");
        assertFalse(queue.isEmpty());
    }

    @Test
    void isEmptyAfterPopAll() {
        Queue queue = new Queue();
        queue.push("Element");
        queue.pop();
        assertTrue(queue.isEmpty());
    }

    @Test
    void isEmptyAfterPartialPop() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.pop();
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.size());
    }

    @Test
    void size() {
        Queue queue = new Queue();
        assertEquals(0, queue.size());
    }

    @Test
    void sizeIncreasesAfterPush() {
        Queue queue = new Queue();
        assertEquals(0, queue.size());
        queue.push("First");
        assertEquals(1, queue.size());
        queue.push("Second");
        assertEquals(2, queue.size());
        queue.push("Third");
        assertEquals(3, queue.size());
    }

    @Test
    void sizeDecreasesAfterPop() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.push("Third");
        assertEquals(3, queue.size());
        queue.pop();
        assertEquals(2, queue.size());
        queue.pop();
        assertEquals(1, queue.size());
        queue.pop();
        assertEquals(0, queue.size());
    }

    @Test
    void sizeNotChangeWhenPopEmpty() {
        Queue queue = new Queue();
        assertEquals(0, queue.size());
        queue.pop();
        assertEquals(0, queue.size());
    }

    @Test
    void sizeWithMixedOperations() {
        Queue queue = new Queue();
        queue.push("A");
        queue.push("B");
        assertEquals(2, queue.size());
        queue.pop();
        assertEquals(1, queue.size());
        queue.push("C");
        queue.push("D");
        assertEquals(3, queue.size());
        queue.pop();
        assertEquals(2, queue.size());
        queue.pop();
        queue.pop();
        assertEquals(0, queue.size());
    }
}