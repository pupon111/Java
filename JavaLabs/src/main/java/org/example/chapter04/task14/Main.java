/*
2. Determine the performance
difference between a regular method call and a method call made through reflection
 */

package org.example.chapter04.task14;

import java.lang.reflect.Method;

public class Main {
    public static void main() throws Exception {
        Test test = new Test();

        long start1 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            test.square(i);
        }
        long end1 = System.nanoTime();

        Method m = Test.class.getMethod("square", int.class);
        long start2 = System.nanoTime();
        for (int i = 0; i < 10000000; i++) {
            m.invoke(test, i);
        }
        long end2 = System.nanoTime();

        System.out.println("Обычный вызов: " + (end1 - start1));
        System.out.println("Рефлексия: " + (end2 - start2));
        System.out.println("Отношение: " + ((end2 - start2) / (end1 - start1)));
    }
}

