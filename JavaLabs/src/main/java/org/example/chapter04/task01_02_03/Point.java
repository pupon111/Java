/*
1. Define a class Point with a constructor public Point(double x, double y) and accessor
methods getX, getY. Define a subclass LabeledPoint with a constructor public
LabeledPoint(String label, double x, double y) and an accessor method getLabel.
2. Define toString, equals, and hashCode methods for the classes of the preceding
exercise.
3. Make the instance variables x and y of the Point class in Exercise 1 protected. Show
that the LabeledPoint class can access these variables only in LabeledPoint instances.
 */

package org.example.chapter04.task01_02_03;

import java.lang.Double;
import java.util.Objects;

public class Point implements Cloneable {
    protected final double x;
    protected final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{x=" + x + ", y=" + y + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return Double.compare(this.x, ((Point) obj).x) == 0 && Double.compare(this.y, ((Point) obj).y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }
}
