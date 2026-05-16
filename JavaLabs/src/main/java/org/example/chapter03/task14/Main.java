/*
Write a method that takes an array of Runnable instances and returns a Runnable
whose run method executes them in order. Return a lambda expression.
 */

package org.example.chapter03.task14;

public class Main {
    static void main() {
        combineRunnable(new Runnable[]{()->{System.out.println(1);}, ()->{System.out.println(2);}}).run();
    }
    @SuppressWarnings("unused")
    public static Runnable combineRunnable(Runnable... actions) {
        return () -> {
            for (Runnable action : actions) {
                action.run();
            }
        };
    }
}
