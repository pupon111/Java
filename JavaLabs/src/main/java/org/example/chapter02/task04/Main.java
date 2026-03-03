package org.example.chapter02.task04;


public class Main {
    private static void swapInt(int a, int b) { //none effect
        int c = a;
        a = b;
        b = c;
    }
    //private void swapIntHolder(IntHolder ) //was deleted in new jdk version
    private static void swapInteger(Integer firstNumber, Integer secondNumber) {} //Integer is immutable
    public static void main(String[] args) {

    }
}
