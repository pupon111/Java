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
