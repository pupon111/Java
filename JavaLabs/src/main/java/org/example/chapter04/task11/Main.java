package org.example.chapter04.task11;

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

