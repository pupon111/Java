package org.example.chapter01.task13;
import java.util.Scanner;
/*
Напишите оператор switch, который, получив строку с направлением компаса "N", "S", "E" или "W",
изменяет значения переменных x и y. Например, для "W" нужно уменьшить x на 1.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите направдение [N,S,E,W]: ");
        String line = scanner.nextLine();
        int x = 0;
        int y = 0;
        switch (line) {
            case "N":
                y++;
                break;
            case "S":
                y--;
                break;
            case "W":
                x--;
                break;
            case "E":
                x++;
                break;
        }
        System.out.println("x: " + x + ", y: " + y);
    }
}
