/*
Implement the RandomSequence in Section 3.9.1 as a nested class, outside the
randomInts method.
 */

package org.example.chapter03.task16;

import org.example.chapter03.task04.IntSequence;

import java.util.Random;


public class Main {

    private static final Random generator = new Random();

    @SuppressWarnings("unused")
    public static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }

    private static class RandomSequence implements IntSequence {
        private final int low;
        private final int high;

        public RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        @Override
        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        @Override
        public boolean hasNext() {
            return true;
        }
    }
}
