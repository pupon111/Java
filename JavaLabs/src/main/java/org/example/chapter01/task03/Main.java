package org.example.chapter01.task03;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
Используя только условный оператор (тернарный оператор), напишите программу,
которая читает три целых числа и выводит наибольшее. Повторите задание, используя Math.max.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Последовательно введите 3 целочисленных значения: ");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int number3= scanner.nextInt();
            //the first way
            int max1 = number1;
            max1 = max1 < number2 ? number2 : max1;
            max1 = max1 < number3 ? number3: max1;
            System.out.printf("max: %d\n", max1);
            //the second way
            int max2 = Math.max(Math.max(number1, number2), number3);
            System.out.printf("max: %d\n", max2);

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
    }
}
