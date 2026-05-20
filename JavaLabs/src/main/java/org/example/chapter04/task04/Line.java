package org.example.chapter04.task04;

import org.example.chapter04.task01.Point;

@SuppressWarnings("unused")
public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX() + to.getX()) / 2,
                (point.getY() + to.getY()) / 2);
    }

    @Override
    public Line clone() {
        Line cloned = (Line) super.clone();
        cloned.to = this.to.clone();
        return cloned;
    }
}