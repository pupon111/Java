/*
7. Define a method Object add(Object first, Object second). If the arguments are
instances of Number, add the values. If they are instances of Boolean, return
Boolean.TRUE if either one is true. Otherwise, concatenate them as strings. Use the
instanceof operator with pattern matching.
 */

package org.example.chapter04.task07;

public class Main {
    public static Object add(Object first, Object second) {
        if (first instanceof Number num1 && second instanceof Number num2) {
            return num1.doubleValue() + num2.doubleValue();
        }

        if (first instanceof Boolean bool1 && second instanceof Boolean bool2) {
            return bool1 || bool2;
        }

        return String.valueOf(first) + second;
    }
}
