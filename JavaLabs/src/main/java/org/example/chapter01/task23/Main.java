package org.example.chapter01.task23;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.setCharAt(0, 'h');
        str = stringBuilder.toString();
        System.out.println(str);
    }
}
