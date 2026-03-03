package org.example.chapter02.task06;

class Point {
    private double x = 0;
    private double y = 0;
    public Point() {}
    public Point(double otherX, double otherY) {
        x = otherX;
        y = otherY;
    }
    public void translate(double xMove, double yMove) {
        x += xMove;
        y += yMove;

    }
    public void scale(double factor) {
        x *= factor;
        y *= factor;
    }
    public void printPoint() {
        System.out.printf("X: %.1f Y: %.1f%n", x, y);
    }
}
public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,4);
        point.translate(1,3);
        point.scale(0.5);
        point.printPoint();
    }
}
