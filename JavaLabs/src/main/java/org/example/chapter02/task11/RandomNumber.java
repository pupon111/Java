package org.example.chapter02.task11;

import java.util.ArrayList;
import java.util.Random;

class RandomNumber {
    static public int randomElement(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[new Random().nextInt(0, arr.length)];
    }

    static public int randomElement(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        return arr.get(new Random().nextInt(0, arr.size()));
    }
}
