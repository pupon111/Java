package org.example.chapter01.task06;
import java.math.BigInteger;
/*
Напишите программу, которая вычисляет факториал n! = 1 × 2 × ... × n,
используя BigInteger. Вычислите факториал числа 1000.
 */
public class Main {
    public static void main(String[] args) {;
        BigInteger number = BigInteger.ONE;
        for (int i = 2; i <= 1000; i++) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Результат: " +  number);
    }
}
