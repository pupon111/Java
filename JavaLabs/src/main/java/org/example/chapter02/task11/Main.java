package org.example.chapter02.task11;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(RandomNumber.randomElement(arr1));
        ArrayList<Integer> arr2 = new ArrayList<>(List.of(10,23,40,50,60,70,80,90,40));
        System.out.println(RandomNumber.randomElement(arr2));
    }
}
class RandomNumber {
    static public int randomElement(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return arr[new Random().nextInt(0,arr.length)];
    }
    static public int randomElement(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        }
        return arr.get(new Random().nextInt(0, arr.size()));
    }
}

