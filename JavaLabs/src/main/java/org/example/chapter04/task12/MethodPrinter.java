/*
12. Use the MethodPrinter program in Section 4.7.1 to enumerate all methods of the
int[] class. Extra credit if you can identify the one method (discussed in this
chapter) that is wrongly described.
 */

package org.example.chapter04.task12;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodPrinter {
     static void main() {
        Class<?> aClass = int[].class;
        Method[] methods = aClass.getDeclaredMethods();

        System.out.println("Class: int[]");
        System.out.println("Methods:\n");

        for (Method m : methods) {
            System.out.print("  " + Modifier.toString(m.getModifiers()) + " ");
            System.out.print(m.getReturnType().getSimpleName() + " ");
            System.out.print(m.getName() + "(");

            Class<?>[] params = m.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                if (i > 0) System.out.print(", ");
                System.out.print(params[i].getSimpleName());
            }
            System.out.println(")");
        }
    }
}
