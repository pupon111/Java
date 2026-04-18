package org.example.chapter03.task02;

public class Employee implements Measurable {
    private final double salary;
    private final String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

