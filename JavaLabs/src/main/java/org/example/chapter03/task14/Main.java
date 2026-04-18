/*
Write a method that takes an array of Runnable instances and returns a Runnable
whose run method executes them in order. Return a lambda expression.
 */

package org.example.chapter03.task14;

public class Main {

    @SuppressWarnings("unused")
    public static Runnable foo(Runnable[] actions) {
        return () -> {
            for (Runnable action : actions) {
                action.run();
            }
        };
    }
}
