/*
1. Provide an interface Measurable with a method double getMeasure() that measures an
object in some way. Make Employee implement Measurable. Provide a method double
average(Measurable[] objects) that computes the average measure. Use it to compute
the average salary of an array of employees.
 */

package org.example.chapter03.task01;

public class Main {
    static void main(String[] ignoredArgs) {
        Employee[] list = {new Employee(10), new Employee(20)};
        System.out.println(average(list));
    }

    static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return objects.length != 0 ? sum / objects.length : 0;
    }
}
