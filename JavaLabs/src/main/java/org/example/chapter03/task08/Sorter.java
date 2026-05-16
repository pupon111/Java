/*
Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
comp) that keeps calling Collections.shuffle on the array list until the elements are in
increasing order, as determined by the comparator.
 */

package org.example.chapter03.task08;

import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Sorter {
    public static void luckySort(List<String> list, Comparator<String> comparator) {
        while (!isSorted(list, comparator)) {
            Collections.shuffle(list);//O(n)
        }
    }

    private static boolean isSorted(List<String> list, Comparator<String> comparator) {
        for (int i = 1; i < list.size(); i++) {
            if (comparator.compare(list.get(i - 1), list.get(i)) > 0) {
                return false;
            }
        }
        return true;
    }
}
