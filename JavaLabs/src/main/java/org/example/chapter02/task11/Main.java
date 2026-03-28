/*
In the RandomNumbers class, provide two static methods randomElement that get a
random element from an array or array list of integers. (Return zero if the array or
array list is empty.) Why couldn’t you make these methods into instance methods of
int[] or ArrayList<Integer>?
 */
package org.example.chapter02.task11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] ignoredArgs) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(RandomNumber.randomElement(arr1));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(10, 23, 40, 50, 60, 70, 80, 90, 40));
        System.out.println(RandomNumber.randomElement(arr2));
    }
}

