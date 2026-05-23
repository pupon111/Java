/*
4. Define an abstract class Shape with an instance variable of class Point, a constructor,
a concrete method public void moveBy(double dx, double dy) that moves the point by
the given amount, and an abstract method public Point getCenter(). Provide
concrete subclasses Circle, Rectangle, Line with constructors public Circle(Point
center, double radius), public Rectangle(Point topLeft, double width, double height),
and public Line(Point from, Point to).
5. Define clone methods for the classes of the preceding exercise.
 */

package org.example.chapter04.task04_05;

import org.example.chapter04.task01_02_03.Point;

public abstract class Shape implements Cloneable {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    @SuppressWarnings("unused")
    public void moveBy(double dx, double dy) {
        point = new Point(point.getX() + dx, point.getY() + dy);
    }

    @SuppressWarnings("unused")
    public abstract Point getCenter();

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape cloned = (Shape) super.clone();
        cloned.point = this.point.clone();
        return cloned;
    }
}
