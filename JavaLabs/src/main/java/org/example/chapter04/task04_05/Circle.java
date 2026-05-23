package org.example.chapter04.task04_05;

import org.example.chapter04.task01_02_03.Point;

@SuppressWarnings("unused")
public class Circle extends Shape implements Cloneable {
    private final double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public Circle clone()  throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
