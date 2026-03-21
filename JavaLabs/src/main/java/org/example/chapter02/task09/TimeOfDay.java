package org.example.chapter02.task09;

class TimeOfDay {
    private int hours = 0;
    private int minutes = 0;

    public TimeOfDay(int hours, int minutes) {
        if (0 <= hours && hours <= 23) {
            this.hours = hours;
        }
        if (0 <= minutes && minutes <= 59) {
            this.minutes = minutes;
        }
    }

    TimeOfDay plusMinutes(int minutes) {
        int sumMinutes = this.hours * 60 + this.minutes + minutes;
        int hoursCount = sumMinutes / 60;
        int minutesCount = sumMinutes % 60;
        if (minutesCount < 0) {
            hoursCount--;
        }
        return new TimeOfDay((hoursCount + 24) % 24, (minutesCount + 60) % 60);
    }

    public int minutesFrom(TimeOfDay other) {
        return Math.abs((this.hours - other.hours) * 60 + this.minutes - other.minutes);
    }

    public void print() {
        System.out.println("time: " + hours + ":" + minutes);
    }
}
