/*
11. Write a program that prints the message "Hello, World!" using reflection to
find the out field in the java.lang.System class and the invoke() method to call the println() method.
 */

package org.example.chapter04.task13;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main() throws Exception {
        Class<?> systemClass = Class.forName("java.lang.System");

        Field outField = systemClass.getField("out");
        Object out = outField.get(null);

        Method printlnMethod = out.getClass().getMethod("println", String.class);

        printlnMethod.invoke(out, "Hello, World");
    }
}