/*
Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
comp) that keeps calling Collections.shuffle on the array list until the elements are in
increasing order, as determined by the comparator.
 */

package org.example.chapter03.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//O(n*m)
public class Sort {
    static boolean needSort(ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 1; i < strings.size(); i++) {
            if (comp.compare(strings.get(i-1), strings.get(i)) > 0) {
                return true;
            }
        }
        return false;
    }
    static void  luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (needSort(strings, comp)) {
            Collections.shuffle(strings);//O(n)
        }
    }
}

//O(n * n! *m)