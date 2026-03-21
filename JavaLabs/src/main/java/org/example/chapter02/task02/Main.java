/*
2. Consider the nextInt method of the Scanner class. Is it an accessor or mutator? Why?
What about the nextInt method of the Random class?
 */
package org.example.chapter02.task02;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = scanner.nextInt(); //mutator method
        int randNumber = random.nextInt(); //mutator method}
    }
}
