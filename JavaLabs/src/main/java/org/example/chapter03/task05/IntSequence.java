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
