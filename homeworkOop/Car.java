package homeworkOop;

import java.util.Scanner;

public class Car {

    private double speed;
    private double fuel;
    private double fuelConsumption;
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Car(double speed, double fuel, double fuelConsumption) {
        this.speed = speed;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void checkDistance() {
        while (fuel > 0) {
            fuel = fuel - (fuelConsumption / 100);
            distance++;
        }
        System.out.println("Машина проедет = " + distance + " км");
    }

    public void goDistance(double distance) {
        if (fuel >= (fuelConsumption / 100) * distance) {
            fuel = fuel - (fuelConsumption / 100) * distance;
            System.out.println("Осталось топлива " + fuel + " л");
        } else {
            System.out.println("На это расстояние не хватает топлива!!!");
        }
    }

    public void addFuel() {
        System.out.println("Сколько топлива заправить?");
        Scanner sc = new Scanner(System.in);
        Double howmach = sc.nextDouble();
        fuel = fuel + howmach;
        System.out.println("В баке сейчас " + fuel);
    }
}
