/*
2. Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with the
largest salary. Why do you need a cast?
 */

package org.example.chapter03.task02;

import org.example.chapter03.task01.Measurable;

public class Main {
    public static Measurable largest(Measurable[] objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable max = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > max.getMeasure()) {
                max = obj;
            }
        }
        return max;
    }

    static void main() {
        Employee[] list = {new Employee(10, "first"), new Employee(20, "second")};
        Employee result = (Employee) largest(list);
        System.out.println(result != null ? result.getName() : null);
    }
}