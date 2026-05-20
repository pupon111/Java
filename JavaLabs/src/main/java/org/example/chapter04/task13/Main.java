package org.example.chapter04.task13;

import java.lang.reflect.Method;

public class Main {
    static void main(String[] args) throws Exception {
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        Method hex = Double.class.getMethod("toHexString", double.class);

        System.out.println("Через Method:");
        ValuesTable.printTable(sqrt, 1, 5, 1);
        System.out.println();
        ValuesTable.printTable(hex, 1, 5, 1);

        System.out.println();
        System.out.println("Через DoubleFunction:");

        ValuesTable.printTable(Math::sqrt, 1, 5, 1);
        System.out.println();
        ValuesTable.printTable(Double::toHexString, 1, 5, 1);
    }
}

