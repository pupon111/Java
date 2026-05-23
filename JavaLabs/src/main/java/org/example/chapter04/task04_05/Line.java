package org.example.chapter04.task04_05;

import org.example.chapter04.task01_02_03.Point;

@SuppressWarnings("unused")
public class Line extends Shape implements Cloneable {
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
    public Line clone()  throws CloneNotSupportedException {
        Line cloned = (Line) super.clone();
        cloned.to = this.to.clone();
        return cloned;
    }
}