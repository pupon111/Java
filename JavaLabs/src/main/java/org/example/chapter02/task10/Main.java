package org.example.chapter02.task10;
class ImutableCar {
    final private double fuel;
    final private double xCoordinate;
    final private double fuelRate;
    public ImutableCar() {
        this.fuel = 0.0;
        this.xCoordinate = 0.0;
        this.fuelRate = 0.0;
    }
    private ImutableCar(double fuel, double xCoordinate, double fuelRate) {
        this.fuel = fuel;
        this.xCoordinate = xCoordinate;
        this.fuelRate = fuelRate;
    }
    public ImutableCar addFuel(double fuel) {
        if (fuel < 0) {
            return this;
        }
        return new ImutableCar(this.fuel + fuel, this.xCoordinate, this.fuelRate);
    }
    public ImutableCar move(double km) {
        if ()
    }
    public double getFuel() {
        return this.fuel;
    }
    public double getXCoordinate() {
        return this.xCoordinate;
    }
}
class MutableCar {
    private double fuel = 0;
    private double xCoordinate = 0;
    final private double fuelRate;
    public MutableCar(double fuelRate) {
        if (fuelRate > 0) {
            this.fuelRate = fuelRate;
        }
        else {
            this.fuelRate = 0;
        }
    }
    public void addFuel(double fuel) {
        if (fuel < 0) {
            return;
        }
        this.fuel += fuel;
    }
    public void ride(double move) {
        if (move < 0) {
            return;
        }
        this.xCoordinate += Math.min(move, fuelRate * fuel);
        fuel = (fuelRate * move > fuel) ? 0 : fuelRate * move;
    }
    public double getFuel() {
        return this.fuel;
    }
    public double getXCoordinate() {
        return this.xCoordinate;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
