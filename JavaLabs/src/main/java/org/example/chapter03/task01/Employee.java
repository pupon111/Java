/*
1. Provide an interface Measurable with a method double getMeasure() that measures an
object in some way. Make Employee implement Measurable. Provide a method double
average(Measurable[] objects) that computes the average measure. Use it to compute
the average salary of an array of employees.
 */

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
