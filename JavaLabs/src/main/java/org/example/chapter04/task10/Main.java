package org.example.chapter04.task10;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {
    public static void main() {
        Class<?> cl = int[].class;

        while (cl != null) {
            System.out.println("class " + cl.getCanonicalName());

            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                    Modifier.toString(m.getModifiers()) + " " +
                    m.getReturnType().getCanonicalName() + " " +
                    m.getName() +
                    Arrays.toString(m.getParameters())
                );
            }

            cl = cl.getSuperclass();
        }
    }
}
