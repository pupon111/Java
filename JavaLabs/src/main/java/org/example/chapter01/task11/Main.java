package org.example.chapter01.task11;
import java.util.Scanner;
/*
Напишите программу, которая читает строку текста и выводит все символы,
не являющиеся ASCII, вместе с их значениями Unicode.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int[] codePoints = str.codePoints().toArray();
        for (int codePoint : codePoints) {
            if (codePoint > 127) System.out.printf("%c = U+%x%n", codePoint, codePoint);
        }
    }
}
