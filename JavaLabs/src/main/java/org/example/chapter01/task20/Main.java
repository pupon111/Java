package org.example.chapter01.task20;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Напишите программу, которая сохраняет треугольник Паскаля до заданного n в ArrayList<ArrayList<Integer>>.
 */
public class Main {
    private static int[][] createPascalsTriangle(int height) {
        int[][] triangle = new int[height][];
        triangle[0] = new int[]{1};
        for (int i = 1; i < height; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
            }
        }
        return triangle;
    }
    private static void printPascalsTriangle(int[][] triangle) {
        for (int i = 0; i < triangle.length; i++) {
            for (int space = 0; space < (triangle.length - i); space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника паскаля (целое положительное значение): ");
        try {
            int height = scanner.nextInt();
            if (height < 0) {
                System.out.println("Высота должна быть > 0");
                return;
            }
            int[][] pascalsTriangle = createPascalsTriangle(height);
            printPascalsTriangle(pascalsTriangle);
        } catch (InputMismatchException e) {
            System.out.println("Неверный формат");
        }
    }
}
