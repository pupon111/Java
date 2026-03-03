package org.example.chapter01.task21;
/*
Усовершенствуйте метод average так, чтобы он вызывался по крайней мере с одним аргументом.
 */
public class Main {
    public static double average(double first, double... values) {
        double sum = first;
        for (double value : values) {
            sum += value;
        }
        return sum / (values.length + 1);
    }
    public static void main(String[] args) {
        System.out.println("Результат 1: " + average(15));
        System.out.println("Результат 2: " + average(2,3,4));
    }
}
