/*
15. Write a method that prints a table of values for any Method representing a static
method with a parameter of type double or Double. Besides the Method object, accept a
lower bound, upper bound, and step size. Demonstrate your method by printing
tables for Math.sqrt and Double.toHexString. Repeat, using a DoubleFunction<Object>
instead of a Method. Contrast the safety, efficiency, and convenience of both
approaches.
 */

package org.example.chapter04.task15;
import java.lang.reflect.Method;

public class Main {
    static void main(String[] args) throws Exception {
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        Method hex = Double.class.getMethod("toHexString", double.class);

        System.out.println("Через Method:");
        ValuesTable.printTable(sqrt, 1, 5, 1);
        System.out.println();
        ValuesTable.printTable(hex, 1, 5, 1);

        System.out.println();
        System.out.println("Через DoubleFunction:");

        ValuesTable.printTable(Math::sqrt, 1, 5, 1);
        System.out.println();
        ValuesTable.printTable(Double::toHexString, 1, 5, 1);
    }
}
