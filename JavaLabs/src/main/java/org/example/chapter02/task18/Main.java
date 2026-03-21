/*
Provide an iterator—an object that yields the elements of the queue in turn—for the
queue of the preceding class. Make Iterator a nested class with methods next and
hasNext. Provide a method iterator() of the Queue class that yields a Queue.Iterator.
Should Iterator be static or not?
 */
package org.example.chapter02.task18;

public class Main {
    static void main() {
        Queue queue = new Queue();
        queue.push("Первый");
        queue.push("Второй");
        queue.push("Третий");
        queue.push("Четвертый");
        queue.push("Пятый");

        Queue.Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println("#" + iterator.next());
        }
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println("#" + iterator.next());
        }
    }
}
