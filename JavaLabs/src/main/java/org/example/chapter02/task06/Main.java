/*
Repeat the preceding exercise, but now implement Point as a class and make
translate and scale into mutators.
 */
package org.example.chapter02.task06;

public class Main {
    public static void main(String[] ignoredArgs) {
        Point point = new Point(3, 4);
        point.translate(1, 3);
        point.scale(0.5);
        point.printPoint();
    }
}

