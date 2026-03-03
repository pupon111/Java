package org.example.chapter01.task08;
import java.util.Scanner;
/*
Напишите программу, которая читает строку и выводит все ее непустые подстроки.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символьную строку: ");
        String str = scanner.nextLine();
        String[] arrStr = str.trim().split(" +");
        for (String item : arrStr) {
            if (item.isEmpty()) continue;
            System.out.println("'" + item + "'");
        }
    }
}
