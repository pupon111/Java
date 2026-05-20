package org.example.chapter04.task04;

import org.example.chapter04.task01.Point;

public abstract class Shape {
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
    public Shape clone() {
        try {
            Shape cloned = (Shape) super.clone();
            cloned.point = this.point.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
