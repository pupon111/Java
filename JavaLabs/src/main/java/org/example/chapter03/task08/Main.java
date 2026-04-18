/*
Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
comp) that keeps calling Collections.shuffle on the array list until the elements are in
increasing order, as determined by the comparator.
 */

package org.example.chapter03.task08;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("D");
        arr.add("A");
        arr.add("C");
        arr.add("B");
        arr.add("E");

        System.out.println("Изначальный массив: " + arr);
        Sort.luckySort(arr, String::compareTo);
        System.out.println("Конечный массив: " + arr);
    }
}
