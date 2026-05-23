package org.example.chapter03.task17;

public class RangeSumOnSegmentTree implements RangeSum {

    private final long[] segTree;
    private final int normalSize;

    public RangeSumOnSegmentTree(int[] inputArr) {
        int originalSize = inputArr.length;

        int powerOfTwo = 0;
        while ((1 << powerOfTwo) < originalSize) {
            powerOfTwo++;
        }
        this.normalSize = 1 << powerOfTwo;

        this.segTree = new long[2 * normalSize];

        for (int i = 0; i < originalSize; i++) {
            segTree[normalSize + i] = inputArr[i];
        }

        build();
    }

    private void build() {
        for (int i = normalSize - 1; i > 0; i--) {
            segTree[i] = segTree[i * 2] + segTree[i * 2 + 1];
        }
    }

    @Override
    public void add(int index, int number) {
        int pos = index + normalSize;
        segTree[pos] += number;

        for (pos /= 2; pos >= 1; pos /= 2) {
            segTree[pos] = segTree[pos * 2] + segTree[pos * 2 + 1];
        }
    }

    @Override
    public long sum(int leftIndex, int rightIndex) {

        int leftIndexInSegmentTree = leftIndex + normalSize;
        int rightIndexInSegmentTree = rightIndex + normalSize;
        long res = 0;

        while (leftIndexInSegmentTree <= rightIndexInSegmentTree) {
            if (leftIndexInSegmentTree % 2 != 0) {
                res += segTree[leftIndexInSegmentTree];
                leftIndexInSegmentTree++;
            }
            if (rightIndexInSegmentTree % 2 == 0) {
                res += segTree[rightIndexInSegmentTree];
                rightIndexInSegmentTree--;
            }
            leftIndexInSegmentTree /= 2;
            rightIndexInSegmentTree /= 2;
        }
        return res;
    }
}
//(2^31 - 1) * (2^31 - 1) = 2^62 - ...