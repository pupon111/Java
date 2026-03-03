package org.example.chapter01.task05;
/*
Что произойдет, если привести (cast) значение типа double,
которое больше максимально возможного значения int, к типу int? Проверьте это на практике.
 */
public class Main {
    public static void main(String[] args) {
        int number = (int) 400000000000.0;
        System.out.println("Число после приведения к int: " + number);
        System.out.println("Максимальное значение int: " + Integer.MAX_VALUE);
    }
}
