/*
Repeat the preceding exercise, but now implement Point as a class and make
translate and scale into mutators.
 */
package org.example.chapter02.task06;

/**
 * mutable class
 * A simple point in a 2D space.
 * A point has an x-coordinate and a y-coordinate.
 */
public class Point {
    private double x;
    private double y;
    public String s;
    public Integer i;
    /**
     * Creates a new point with the given x and y values.
     *
     * @param otherX the x-coordinate of the point
     * @param otherY the y-coordinate of the point
     */
    public Point(double otherX, double otherY) {
        x = otherX;
        y = otherY;
    }

    /**
     * Moves this point by the given amounts.
     * Changes the point's position.
     *
     * @param xMove the amount to move on the x-axis
     * @param yMove the amount to move on the y-axis
     */
    public void translate(double xMove, double yMove) {
        x += xMove;
        y += yMove;
    }

    /**
     * Changes the size of this point from the origin.
     * Multiplies both x and y by the given factor.
     *
     * @param factor the number to multiply by
     */
    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }

    /**
     * Prints the point to the screen.
     * Shows the x and y values with one decimal place.
     */
    public void printPoint() {
        System.out.printf("X: %.1f Y: %.1f%n", x, y);
    }
}
