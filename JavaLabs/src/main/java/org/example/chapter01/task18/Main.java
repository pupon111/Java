package org.example.chapter01.task18;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
/*
Напишите программу, которая выводит комбинацию для лотереи, выбирая шесть различных чисел от 1 до 49.
Чтобы выбрать шесть различных чисел, начните со списка (ArrayList), заполненного числами 1...49.
Выберите случайный индекс и удалите элемент. Повторите шесть раз. Выведите результат в отсортированном порядке.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<>(50);
        for (int i = 0; i < 50; i++) {
            allNumbers.add(i);
        }
        ArrayList<Integer> wonNumbers = new ArrayList<>(6);
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            wonNumbers.add(allNumbers.remove(random.nextInt(0,49)));
        }
        wonNumbers.sort(Comparator.naturalOrder());
        for (int numbers : wonNumbers) {
            System.out.println(numbers);
        }
    }
}
