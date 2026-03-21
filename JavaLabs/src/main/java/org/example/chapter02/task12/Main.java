package org.example.chapter02.task12;
import java.time.LocalDate;
import static java.time.LocalDate.*;
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        LocalDate date = now().withDayOfMonth(1);
        out.println(" Sun Mon Tue Wed Thu Fri Sat");
        int dayNumber = date.getDayOfWeek().getValue();
        for (int i = 0; i < dayNumber % 7; i++) {
            out.print("    ");
        }
        int monthNumber = date.getMonthValue();
        while (date.getMonthValue() == monthNumber) {
            out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                out.println();
        }
        if (date.getDayOfWeek().getValue() != 7) {
            out.println();
        }
    }
}