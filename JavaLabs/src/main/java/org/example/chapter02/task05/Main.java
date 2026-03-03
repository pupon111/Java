package org.example.chapter02.task05;
class Point {
    private double x = 0;
    private double y = 0;
    public Point() {}
    public Point(double otherX, double otherY) {
        x = otherX;
        y = otherY;
    }
    public Point translate(double xMove, double yMove) {
        return new Point(x + xMove, y + yMove);
    }
    public Point scale(double factor) {
        return new Point(x * factor, y * factor);
    }
    public void printPoint() {
        System.out.printf("X: %.1f Y: %.1f%n", x, y);
    }
}
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.printPoint();
        Point point2 = new Point(1,1).translate(2,2);
        point2.printPoint();
        Point point3 = new Point(3,4).translate(1,3).scale(0.5);
        point3.printPoint();
    }
}
