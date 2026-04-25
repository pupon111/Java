/*
Implement a static of method of the IntSequence class that yields a sequence with
the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a sequence with
six values. Extra credit if you return an instance of an anonymous inner class.
 */

package org.example.chapter03.task04;

public interface IntSequence {
    static IntSequence ofNotAnon(int... args) {
        return new NumberSequence(args);
    }

    static IntSequence ofAnon(int... args) {
        return new IntSequence() {
            private final int[] arr = args;
            private int position = 0;

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
        };
    }

    boolean hasNext();

    int next();
}
