package org.example.chapter01.task19;
import java.util.ArrayList;
import java.util.Scanner;

/*
Напишите программу, которая читает двумерный массив целых чисел и определяет, является ли он
магическим квадратом (т. е. равна ли сумма всех строк, всех столбцов и обеих диагоналей одному и тому же числу).
Программа должна принимать строки ввода, разбивать их на отдельные целые числа
и завершать работу, когда пользователь вводит пустую строку.
 */

public class Main {
    public static ArrayList<Integer> pars(String[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (String item : arr) {
            result.add(Integer.parseInt(item));
        }
        return result;
    }
    private static boolean isMagicSquare(ArrayList<ArrayList<Integer>> square) {
        int magicSum = 0;
        for (int number : square.getFirst()) { magicSum += number; }
        int diagSum = 0;
        int secDiagSum = 0;
        for (int i = 0; i < square.size(); i++) {
            int sumLine = 0;
            int sumColumn = 0;
            for (int j = 0; j < square.size(); j++) {
                sumLine += square.get(i).get(j);
                sumColumn += square.get(j).get(i);
            }
            if (sumLine != magicSum || sumColumn != magicSum) return false;
            diagSum += square.get(i).get(i);
            secDiagSum += square.get(i).get(square.size() - 1 - i);
        }
        return diagSum == magicSum && secDiagSum == magicSum;
    }
    private static boolean isSquare(ArrayList<ArrayList<Integer>> arr) {
        for (ArrayList<Integer> item : arr) {
            if (item.size() != arr.size()) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Построчно введите числовые значения:");
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        while(scanner.hasNextLine()) {
            String str = scanner.nextLine();
            String trimmed = str.trim();
            if (trimmed.isEmpty()) break;
            String[] arrStr = trimmed.split(" +");
            try {
                arr.add(pars(arrStr));
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода");
                return;
            }
        }
        System.out.println(isSquare(arr) && isMagicSquare(arr));
    }
}
