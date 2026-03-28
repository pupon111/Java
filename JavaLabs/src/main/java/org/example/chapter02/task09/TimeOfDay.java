/*
9. Implement a record TimeOfDay with hour and minute components. Normalize them so
that the hour is between 0 and 23 and the minute between 0 and 59. Provide a
method TimeOfDay plusMinutes(int minutes) that yields a new TimeOfDay object, the
given number of minutes away, and a method int minutesFrom(TimeOfDay other) that
yields the minutes between this and the given TimeOfDay instance.
 */
package org.example.chapter02.task09;

class TimeOfDay {
    private static final int MIN_HOURS = 0;
    private static final int MAX_HOURS = 23;
    private static final int MIN_MINUTES = 0;
    private static final int MAX_MINUTES = 59;
    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;

    private int hours = 0;
    private int minutes = 0;

    public TimeOfDay(int hours, int minutes) {
        if (hours >= MIN_HOURS && hours <= MAX_HOURS) {
            this.hours = hours;
        }
        if (minutes >= MIN_MINUTES && minutes <= MAX_MINUTES) {
            this.minutes = minutes;
        }
    }

    TimeOfDay plusMinutes(int minutes) {
        int sumMinutes = this.hours * MINUTES_IN_HOUR + this.minutes + minutes;
        int hoursCount = sumMinutes / MINUTES_IN_HOUR;
        int minutesCount = sumMinutes % MINUTES_IN_HOUR;
        if (minutesCount < MIN_MINUTES) {
            hoursCount--;
        }
        return new TimeOfDay((hoursCount + HOURS_IN_DAY) % HOURS_IN_DAY,
                (minutesCount + MINUTES_IN_HOUR) % MINUTES_IN_HOUR);
    }

    public int minutesFrom(TimeOfDay other) {
        int thisTotal = this.hours * MINUTES_IN_HOUR + this.minutes;
        int otherTotal = other.hours * MINUTES_IN_HOUR + other.minutes;
        int minutesInDay = HOURS_IN_DAY * MINUTES_IN_HOUR;
        return (thisTotal > otherTotal) ? minutesInDay - thisTotal + otherTotal : otherTotal - thisTotal;
    }

    public void print() {
        System.out.println("time: " + hours + ":" + minutes);
    }
}
