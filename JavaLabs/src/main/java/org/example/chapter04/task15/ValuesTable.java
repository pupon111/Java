package org.example.chapter04.task15;

import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class ValuesTable {
    public static void printTable(Method method, double from, double to, double step) throws Exception {
        for (double x = from; x <= to; x += step) {
            Object result = method.invoke(null, x);
            System.out.println(x + " -> " + result);
        }
    }

    public static void printTable(DoubleFunction<Object> function, double from, double to, double step) {
        for (double x = from; x <= to; x += step) {
            System.out.println(x + " -> " + function.apply(x));
        }
    }
}
