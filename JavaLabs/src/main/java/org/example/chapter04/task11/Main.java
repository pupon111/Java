package org.example.chapter04.task11;

import org.example.chapter04.task01_02_03.Point;

public class Main {
    public static void main() {
        Person p = new Person("Anna", 20, new Point(2, 3));
        System.out.println(UniversalToString.toString(p));
    }
}

class Person {
    private final String name;
    private final int age;
    private final Point point;

    public Person(String name, int age, Point point) {
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Point getPoint() {
        return point;
    }
}

