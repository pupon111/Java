package org.example.chapter03.task01;

public class Employee implements Measurable {
    private final double salary;

    public Employee(int salary) {
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
