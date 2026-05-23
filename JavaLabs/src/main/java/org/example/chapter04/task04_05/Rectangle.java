package org.example.chapter04.task04_05;

import org.example.chapter04.task01_02_03.Point;

@SuppressWarnings("unused")
public class Rectangle extends Shape implements Cloneable {
    private final double width;
    private final double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() + height / 2);
    }

    @Override
    public Rectangle clone()  throws CloneNotSupportedException  {
        return (Rectangle) super.clone();
    }
}
