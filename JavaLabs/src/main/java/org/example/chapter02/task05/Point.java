package org.example.chapter02.task05;

/**
 * immutable class
 * A simple point in a 2D space.
 * A point has an x-coordinate and a y-coordinate.
 */
class Point {
    private final double x;
    private final double y;

    /**
     * Creates a new point at the origin (0, 0).
     */
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Creates a new point with the given x and y values.
     *
     * @param x the x-coordinate of the point
     * @param y the y-coordinate of the point
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Moves this point by the given amounts.
     * Returns a new point at the new position.
     *
     * @param xMove the amount to move on the x-axis
     * @param yMove the amount to move on the y-axis
     * @return a new point after moving
     */
    public Point translate(double xMove, double yMove) {
        return new Point(x + xMove, y + yMove);
    }

    /**
     * Changes the size of this point from the origin.
     * Multiplies both x and y by the given factor.
     *
     * @param factor the number to multiply by
     * @return a new point after scaling
     */
    public Point scale(double factor) {
        return new Point(x * factor, y * factor);
    }

    /**
     * Prints the point to the screen.
     * Shows the x and y values with one decimal place.
     */
    public void printPoint() {
        System.out.printf("X: %.1f Y: %.1f%n", x, y);
    }
}
