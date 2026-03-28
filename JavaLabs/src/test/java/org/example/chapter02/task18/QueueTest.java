package org.example.chapter02.task18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

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
    void popMultipleElementsFIFO() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.push("Third");

        assertEquals("First", queue.pop());
        assertEquals("Second", queue.pop());
        assertEquals("Third", queue.pop());
        assertEquals(0, queue.size());
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

    @Test
    void iteratorHasNext() {
        Queue queue = new Queue();
        Queue.Iterator iterator = queue.iterator();

        assertFalse(iterator.hasNext());

        queue.push("First");
        iterator = queue.iterator();
        assertTrue(iterator.hasNext());
    }

    @Test
    void iteratorNext() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.push("Third");

        Queue.Iterator iterator = queue.iterator();

        assertEquals("First", iterator.next());
        assertEquals("Second", iterator.next());
        assertEquals("Third", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void iteratorNextWithEmptyQueue() {
        Queue queue = new Queue();
        Queue.Iterator iterator = queue.iterator();

        assertFalse(iterator.hasNext());
        assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    void iteratorNextAfterPartialIteration() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.push("Third");

        Queue.Iterator iterator = queue.iterator();

        assertEquals("First", iterator.next());
        assertEquals("Second", iterator.next());

        assertTrue(iterator.hasNext());
        assertEquals("Third", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void iteratorNextAfterModifyingQueue() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");

        Queue.Iterator iterator = queue.iterator();

        assertEquals("First", iterator.next());

        queue.push("Third");

        assertEquals("Second", iterator.next());
        assertEquals("Third", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void iteratorMultipleIterators() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.push("Third");

        Queue.Iterator iterator1 = queue.iterator();
        Queue.Iterator iterator2 = queue.iterator();

        assertEquals("First", iterator1.next());
        assertEquals("First", iterator2.next());
        assertEquals("Second", iterator1.next());
        assertEquals("Second", iterator2.next());
        assertEquals("Third", iterator1.next());
        assertEquals("Third", iterator2.next());

        assertFalse(iterator1.hasNext());
        assertFalse(iterator2.hasNext());
    }

    @Test
    void iteratorAfterPop() {
        Queue queue = new Queue();
        queue.push("First");
        queue.push("Second");
        queue.push("Third");

        queue.pop();

        Queue.Iterator iterator = queue.iterator();

        assertEquals("Second", iterator.next());
        assertEquals("Third", iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void iteratorWithSingleElement() {
        Queue queue = new Queue();
        queue.push("Only");

        Queue.Iterator iterator = queue.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("Only", iterator.next());
        assertFalse(iterator.hasNext());
    }
}