package org.example.chapter03.task17;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        RangeSum segmentTree = new RangeSumOnSegmentTree(arr);
        RangeSum fenwickTree = new RangeSumOnFenwickTree(arr);

        System.out.println("Segment Tree: " + segmentTree.sum(1, 3));
        System.out.println("Fenwick Tree: " + fenwickTree.sum(1, 3));

        segmentTree.add(2, 5);
        fenwickTree.add(2, 5);

        System.out.println("Segment Tree: " + segmentTree.sum(1, 3));
        System.out.println("Fenwick Tree: " + fenwickTree.sum(1, 3));

        System.out.println("Segment Tree: " + segmentTree.sum(0, 4));
        System.out.println("Fenwick Tree: " + fenwickTree.sum(0, 4));
    }
}