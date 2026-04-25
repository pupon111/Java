/*
Add a static method with the name constant of the IntSequence class that yields an
infinite constant sequence. For example, IntSequence.constant(1) yields values 1 1
1..., ad infinitum. Extra credit if you do this with a lambda expression.
 */

package org.example.chapter03.task05;

public interface IntSequence {
    static IntSequence constant(int number) {
        return new ConstantSequence(number);
    }

    static IntSequence constantWithLambda(int number) {
        return () -> number;
    }

    default boolean hasNext() {
        return true;
    }

    int next();
}
