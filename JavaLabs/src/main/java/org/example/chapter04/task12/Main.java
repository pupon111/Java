package org.example.chapter04.task12;

import java.lang.reflect.Method;

public class Main {
    public static void main() throws Exception {
        Test test = new Test();
        int n = 10000000;

        long start1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            test.square(i);
        }
        long end1 = System.nanoTime();

        Method m = Test.class.getMethod("square", int.class);
        long start2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            m.invoke(test, i);
        }
        long end2 = System.nanoTime();

        System.out.println("Обычный вызов: " + (end1 - start1));
        System.out.println("Рефлексия: " + (end2 - start2));
        System.out.println("Отношение: " + ((end2 - start2) / (end1 - start1)));
    }
}

