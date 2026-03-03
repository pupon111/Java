package org.example.chapter01.task12;

import java.util.Scanner;
/*
Напишите выражение switch, которое, получив строку с направлением компаса "N", "S", "E" или "W",
возвращает массив смещений по осям x и y. Например, для "W" должно возвращаться new int[] { -1, 0 }.
 */
public class Main {
    public static int[] foo(String str) {
        return switch (str) {
            case "N" -> new int[]{0, 1};
            case "S" -> new int[]{0, -1};
            case "W" -> new int[]{-1, 0};
            case "E" -> new int[]{1, 0};
            default -> new int[]{0, 0};
        };
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите направдение [N,S,E,W]: ");
        String line = scanner.nextLine();
        int[] arr = foo(line);
        for (int item : arr) { System.out.println(item); }
    }
}
