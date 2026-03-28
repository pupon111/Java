/*
1. Change the calendar printing program so it starts the week on a Sunday.
Also make it print a newline at the end (but only one).
 */
package org.example.chapter02.task01;

import java.time.LocalDate;

public class Main {
    public static void main(String[] ignoredArgs) {
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        int dayNumber = date.getDayOfWeek().getValue();
        for (int i = 0; i < dayNumber % 7; i++) {
            System.out.print("    ");
        }
        int monthNumber = date.getMonthValue();
        while (date.getMonthValue() == monthNumber) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 7) {
            System.out.println();
        }
    }
}
