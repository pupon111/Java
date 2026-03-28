/*
Add methods translate and scale to the Point record. The translate method moves
the point by a given amount in x- and y-direction. The scale method scales both
coordinates by a given factor. Implement these methods so that they return new
points with the results. For example,
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
should set p to a point with coordinates (2, 3.5).
 */
package org.example.chapter02.task05;

public class Main {
    public static void main(String[] ignoredArgs) {
        Point point1 = new Point();
        point1.printPoint();
        Point point2 = new Point(1, 1).translate(2, 2);
        point2.printPoint();
        Point point3 = new Point(3, 4).translate(1, 3).scale(0.5);
        point3.printPoint();
    }
}


