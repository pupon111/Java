package org.example.chapter03.task17;

public class RangeSumOnFenwickTree implements RangeSum {

    private final int[] fenwickTree;
    private final int[] array;
    private final int arraySize;

    public RangeSumOnFenwickTree(int[] inputArray) {
        this.arraySize = inputArray.length;
        this.array = new int[arraySize];
        this.fenwickTree = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            increase(i, inputArray[i]);
        }
    }

    private long prefixSum(int index) {
        long result = 0;
        for (int x = index; x >= 0; x = (x & (x + 1)) - 1) {
            result += fenwickTree[x];
        }
        return result;
    }

    private void increase(int index, int delta) {
        array[index] += delta;
        for (; index < arraySize; index |= index + 1) {
            fenwickTree[index] += delta;
        }
    }

    @Override
    public long sum(int leftIndex, int rightIndex) {
        if (leftIndex == 0) {
            return prefixSum(rightIndex);
        } else {
            return prefixSum(rightIndex) - prefixSum(leftIndex - 1);
        }
    }

    @Override
    public void add(int index, int number) {
        increase(index, number);
    }
}
