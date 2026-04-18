/*
Write a call to Arrays.sort that sorts employees by salary, breaking ties by name.
Use Comparator.thenComparing. Then do this in reverse order.
 */

package org.example.chapter03.task15;

import org.example.chapter03.task02.Employee;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    static void main() {
        Employee[] employees = {
                new Employee(40, "3"),
                new Employee(30, "1"),
                new Employee(30, "2"),
                new Employee(30, "3"),
                new Employee(25, "2"),
                new Employee(100, "0")};

        Comparator<Employee> bySalary = Comparator.comparingDouble(Employee::getMeasure);
        Comparator<Employee> byName = Comparator.comparing(Employee::getName);

        Arrays.sort(employees, bySalary.thenComparing(byName));
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + " salary: " + employee.getMeasure());
        }

        Arrays.sort(employees, byName.thenComparing(bySalary));
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + " salary: " + employee.getMeasure());
        }
    }
}
