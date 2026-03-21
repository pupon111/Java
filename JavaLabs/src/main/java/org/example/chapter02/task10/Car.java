package org.example.chapter02.task10;

class Car {
    private double fuel = 0.0;
    private double xCoordinate = 0.0;
    final private double fuelRate;

    public Car(double fuelRate) {
        this.fuelRate = Math.max(fuelRate, 0.0);
    }

    public void addFuel(double fuel) {
        if (fuel < 0) {
            return;
        }
        this.fuel += fuel;
    }

    public void move(double km) {
        if (km < 0) {
            return;
        }
        double move = Math.min(km, this.fuel * this.fuelRate);
        this.xCoordinate += move;
        this.fuel -= move / this.fuelRate;
    }

    public double getFuel() {
        return this.fuel;
    }

    public double getXCoordinate() {
        return this.xCoordinate;
    }

    public void printInfo() {
        System.out.printf("""
                fuelRate: %.3f;
                fuel: %.3f;
                xCoordinate: %.3f%n
                """, this.fuelRate, this.fuel, this.xCoordinate);
    }
}
