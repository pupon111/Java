/*
Implement methods
public static void runTogether(Runnable... tasks)
public static void runInOrder(Runnable... tasks)
The first method should run each task in a separate thread and then return. The
second method should run all methods in the current thread and return when the
last one has completed.
 */

package org.example.chapter03.task10;

public class Main {
    @SuppressWarnings("unused")
    public static void runTogether(Runnable... tasks) {
        Thread[] threads = new Thread[tasks.length];
        for (int i = 0; i < tasks.length; i++) {
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }
        for (Thread th : threads) {
            try {
                th.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unused")
    public static void runInOrder(Runnable... tasks) {
        for (Runnable obj : tasks) {
            obj.run();
        }
    }
}
