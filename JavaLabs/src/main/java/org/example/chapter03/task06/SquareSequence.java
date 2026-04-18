/*
The SquareSequence class doesn’t actually deliver an infinite sequence of squares due
to integer overflow. Specifically, how does it behave? Fix the problem by defining a
Sequence<T> interface and a SquareSequence class that implements Sequence<BigInteger>.
 */

package org.example.chapter03.task06;

import java.math.BigInteger;

@SuppressWarnings("unused")
public class SquareSequence implements Sequence<BigInteger> {
    private BigInteger value = BigInteger.ZERO;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        value = value.add(BigInteger.ONE);
        return value.multiply(value);
    }
}
