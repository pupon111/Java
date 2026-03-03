package org.example.chapter01.task01;
import java.util.Scanner;
import java.util.InputMismatchException;

/*
Напишите программу, вводящую целочисленное значение и выводящую
его в двоичной, восьмеричной и шестнадцатеричной форме.
Организуйте вывод обратного значения в виде шестнадцатеричного числа
с плавающей точкой.
*/
public class Main {
    public static void main(String[] args){
        System.out.print("Введите целочисленное значение: ");
        Scanner scanner = new Scanner(System.in);
        try {
            int number = scanner.nextInt();
            System.out.printf("""
                    Введенное число: %d
                    В двоичной: %s
                    В восьмеричной: %o
                    В шестнадцатиричной: %x
                    Величина обратного значения в шестнадцатиричной форме: %a
                    """, number, Integer.toString(number,2), number, number, 1.0/number);
        } catch (InputMismatchException  e) {
            System.out.println("Неверный формат ввода.");
        }
    }
}
