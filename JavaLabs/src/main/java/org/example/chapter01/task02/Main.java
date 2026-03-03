package org.example.chapter01.task02;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
Напишите программу, которая читает целый угол (может быть положительным или отрицательным)
и нормализует его до значения от 0 до 359 градусов.
Сначала попробуйте сделать это с оператором %, затем с floorMod.
*/
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите целочисленное значение: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            //the first way
            int degree1 = number % 360;
            System.out.printf("Нормализованный угол (1 способ): %d", degree1 < 0 ? 360 + degree1 : degree1);
            //the second way
            int degree2 = Math.floorMod(number, 360);
            System.out.printf("Нормализованный угол (2 способ): %d", degree2 < 0 ? 360 + degree2 : degree2);
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
    }
}
