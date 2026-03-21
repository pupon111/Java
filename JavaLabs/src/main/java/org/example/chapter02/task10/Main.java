/*
Implement a class Car that models a car traveling along the x-axis, consuming gas
as it moves. Provide methods to drive by a given number of miles, to add a given
number of gallons to the gas tank, and to get the current distance from the origin
and fuel level. Specify the fuel efficiency (in miles/gallons) in the constructor.
Should this be an immutable class? Why or why not?
 */
package org.example.chapter02.task10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5.2);
        car.addFuel(2);
        car.move(5);
        car.printInfo();
    }
}

