package org.example.chapter04.additional_task;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner {
    private static final Map<Class<?>, Object> instances = new HashMap<>();
    private static final ArrayList<String> results = new ArrayList<>();

    public static void run(Set<Class<?>> classes) {
        for (Class<?> concreteClass : classes) {
            Method[] methods = concreteClass.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(Run.class)) {
                    executeMethod(concreteClass, method);
                }
            }
        }
        printResultsTable();
    }

    static void executeMethod(Class<?> concreteClass, Method method) {
        method.setAccessible(true);
        String status = "OK";

        long start = System.currentTimeMillis();

        try {
            method.invoke(resolveInstance(concreteClass, method));
        } catch (Exception e) {
            Throwable cause = e.getCause() != null ? e.getCause() : e;
            status = cause.getClass().getSimpleName() + ": " + cause.getMessage();
        }

        long executionTime = System.currentTimeMillis() - start;

        String formattedLine = String.format("| %-25s | %-30s | %15d ms | %-35s |",
                concreteClass.getSimpleName(), method.getName(), executionTime, status);

        results.add(formattedLine);
    }

    private static Object resolveInstance(Class<?> concreteClass, Method method) throws RuntimeException {
        if (Modifier.isStatic(method.getModifiers())) {
            return null;
        }
        if (instances.containsKey(concreteClass)) {
            return instances.get(concreteClass);
        }
        try {
            Object instance = concreteClass.getDeclaredConstructor().newInstance();
            instances.put(concreteClass, instance);
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Cannot instantiate " + concreteClass.getSimpleName(), e);
        }
    }

    private static void printResultsTable() {
        System.out.printf("| %-25s | %-30s | %18s | %-35s |%n", "Класс", "Метод", "Время выполнения", "Результат выполнения");

        for (String line : results) {
            System.out.println(line);
        }
    }
}
