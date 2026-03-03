package org.example.chapter01.task07;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
Напишите программу, которая читает два целых числа в диапазоне от 0 до 4294967295,
сохраняет их в переменных типа int и вычисляет и отображает их беззнаковую сумму, разность,
произведение, частное и остаток. Не конвертируйте их в тип long.
 */
//в данном случае не int/long, а short/int (принцип аналогичный)
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите целочисленное значение в диапазоне от 0 до 65535: ");
            short shortNumber1 = (short) scanner.nextInt();
            System.out.print("Введите целочисленное значение в диапазоне от 0 до 65535: ");
            short shortNumber2 = (short) scanner.nextInt();

            int sum = (Short.toUnsignedInt(shortNumber1) + Short.toUnsignedInt(shortNumber2));
            int dif = (Short.toUnsignedInt(shortNumber1) - Short.toUnsignedInt(shortNumber2));
            int prod = (Short.toUnsignedInt(shortNumber1) * Short.toUnsignedInt(shortNumber2));
            int quot = (Short.toUnsignedInt(shortNumber1) / Short.toUnsignedInt(shortNumber2));
            int rem = (Short.toUnsignedInt(shortNumber1) % Short.toUnsignedInt(shortNumber2));

            System.out.println("+ : " + sum);
            System.out.println("- : " + dif);
            System.out.println("* : " + prod);
            System.out.println("/ : " + quot);
            System.out.println("% : " + rem);
        } catch(InputMismatchException e) {
            System.out.println("Неверный ввод");
        }
    }
}
