package org.example.chapter04.task04;

import org.example.chapter04.task01.Point;

@SuppressWarnings("unused")
public class Circle extends Shape {
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
    public Circle clone() {
        return (Circle) super.clone();
    }
}
