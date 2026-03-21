/*
4. Why can’t you implement a Java method that swaps the contents of two int
variables? Instead, write a method that swaps the contents of two IntHolder objects.
(Look up this rather obscure class in the API documentation.) Can you swap the
contents of two Integer objects?
 */
package org.example.chapter02.task04;

public class Main {
    private static void swapInt(int a, int b) { //none effect
        int c = a;
        a = b;
        b = c;
    }

    //private void swapIntHolder(IntHolder ) //was deleted in new jdk version
    private static void swapInteger(Integer firstNumber, Integer secondNumber) {
    } //Integer is immutable

    public static void main(String[] args) {
    }
}
