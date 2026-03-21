/*
9. Implement a record TimeOfDay with hour and minute components. Normalize them so
that the hour is between 0 and 23 and the minute between 0 and 59. Provide a
method TimeOfDay plusMinutes(int minutes) that yields a new TimeOfDay object, the
given number of minutes away, and a method int minutesFrom(TimeOfDay other) that
yields the minutes between this and the given TimeOfDay instance.
 */

package org.example.chapter02.task09;

public class Main {
    public static void main(String[] args) {
        TimeOfDay time1 = new TimeOfDay(1, 2);
        TimeOfDay time2 = time1.plusMinutes(3126).plusMinutes(23);
        time1.print();
        time2.print();
        System.out.println(time1.minutesFrom(time2));
    }
}
