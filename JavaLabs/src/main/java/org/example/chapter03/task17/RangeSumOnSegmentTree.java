package org.example.chapter03.task17;

public class RangeSumOnSegmentTree implements RangeSum {

    private final long[] segTree;
    private final int n;

    public RangeSumOnSegmentTree(int[] inputArr) {
        int originalSize = inputArr.length;

        int N = 0;
        while ((1 << N) < originalSize) {
            N++;
        }
        this.n = 1 << N;

        this.segTree = new long[2 * n];

        for (int i = 0; i < originalSize; i++) {
            segTree[n + i] = inputArr[i];
        }

        build();
    }

    private void build() {
        for (int i = n - 1; i > 0; i--) {
            segTree[i] = segTree[i * 2] + segTree[i * 2 + 1];
        }
    }

    @Override
    public void add(int index, int number) {
        int pos = index + n;
        segTree[pos] += number;

        for (pos /= 2; pos >= 1; pos /= 2) {
            segTree[pos] = segTree[pos * 2] + segTree[pos * 2 + 1];
        }
    }

    @Override
    public long sum(int rightIndex, int leftIndex) {

        int l = rightIndex + n;
        int r = leftIndex + n;
        long res = 0;

        while (l <= r) {
            if (l % 2 != 0) {
                res += segTree[l];
                l++;
            }
            if (r % 2 == 0) {
                res += segTree[r];
                r--;
            }
            l /= 2;
            r /= 2;
        }
        return res;
    }
}
