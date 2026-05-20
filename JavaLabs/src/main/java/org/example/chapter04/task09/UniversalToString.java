package org.example.chapter04.task09;

import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class UniversalToString {
    public static String toString(Object obj) {
        if (obj == null) return "null";

        Class<?> cl = obj.getClass();
        StringBuilder result = new StringBuilder();
        result.append(cl.getSimpleName()).append("[");

        Field[] fields = cl.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);

            if (i > 0) result.append(", ");

            result.append(f.getName()).append("=");

            try {
                result.append(f.get(obj));
            } catch (Exception e) {
                result.append("?");
            }
        }

        result.append("]");
        return result.toString();
    }
}

