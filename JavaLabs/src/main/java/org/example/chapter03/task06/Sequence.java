/*
The SquareSequence class doesn’t actually deliver an infinite sequence of squares due
to integer overflow. Specifically, how does it behave? Fix the problem by defining a
Sequence<T> interface and a SquareSequence class that implements Sequence<BigInteger>.
 */

package org.example.chapter03.task06;

public interface Sequence<T> {
    boolean hasNext();

    T next();
}
