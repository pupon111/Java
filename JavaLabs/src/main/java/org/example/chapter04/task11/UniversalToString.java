/*
11. Write a “universal” toString method that uses reflection to yield a string with all
instance variables of an object. Extra credit if you can handle cyclic references.
 */

package org.example.chapter04.task11;

import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class UniversalToString {
    public static String toString(Object obj) {
        if (obj == null) return "null";

        Class<?> infClass = obj.getClass();
        StringBuilder result = new StringBuilder();
        result.append(infClass.getSimpleName()).append("[");

        Field[] fields = infClass.getDeclaredFields();

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

