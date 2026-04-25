/*
2. Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with the
largest salary. Why do you need a cast?
 */

package org.example.chapter03.task02;

import org.example.chapter03.task01.Measurable;

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

