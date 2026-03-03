package org.example.chapter01.task10;
import java.util.Random;
/*
Напишите программу, которая генерирует случайную строку из букв и цифр,
создавая случайное значение типа long и выводя его в системе счисления с основанием 36.
 */
public class Main {
    public static void main(String[] ignoredArgs) {
        Random random = new Random();
        System.out.println("Результат: " + Long.toString(random.nextLong(), 36));
    }
}
