package org.example.chapter03.task04;

public class NumberSequence implements IntSequence {
    private final int[] arr;
    private int position = 0;

    public NumberSequence(int... args) {
        arr = args;
    }

    @Override
    public boolean hasNext() {
        return position < arr.length;
    }

    @Override
    public int next() {
        if (hasNext()) {
            return arr[position++];
        } else {
            return 0;
        }
    }
}
