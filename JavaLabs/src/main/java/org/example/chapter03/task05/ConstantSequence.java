/*
Add a static method with the name constant of the IntSequence class that yields an
infinite constant sequence. For example, IntSequence.constant(1) yields values 1 1
1..., ad infinitum. Extra credit if you do this with a lambda expression.
 */

package org.example.chapter03.task05;

public class ConstantSequence implements IntSequence {
    private final int number;

    public ConstantSequence(int number) {
        this.number = number;
    }

    @Override
    public int next() {
        return number;
    }
}
