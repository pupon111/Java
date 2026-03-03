package org.example.chapter01.task04;
/*
Напишите программу, которая выводит наименьшее и наибольшее положительные значения типа double.
Подсказка: Посмотрите метод Math.nextUp в Java API.
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("""
        Наименьшее положительное значение: %e
        Наибольшее положительное значение: %e \n""", Math.nextUp(0.0), Double.MAX_VALUE);
    }
}
