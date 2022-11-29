package hw2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Car {
    private final Engine engine;
    private GasTank gasTank;
    private String model;
    private int yearCar;
    private int distance;
    private int mile;
    private boolean startEngine;

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void startCar() {
        if (!startEngine) {
            engineOn();
            System.out.println("The car stared");
            goCar();
        } else {
            System.out.println("The car don't drive");
        }
    }

    public void stopCar() {
        System.out.println("The car stopped");
        engineOff();
        startEngine = false;
        distance += mile;
    }

    private void engineOff() {
        System.out.println("The engine off");
        startEngine = false;
    }

    public void engineOn() {
        if (gasTank.getFuelResidue() > 0) {
            System.out.println("The engine stared");
            startEngine = true;
        }
    }


    public int calculateFuelResidue() {
        int result = gasTank.getFuelResidue() - gasTank.getFuelConsumption();
        return result;
    }

    public void goCar() {
        System.out.println("The car went");
    }

    public void refueling(int liters) {
        if (gasTank.getFuelResidue() + liters > gasTank.getFuelTank()) {
            System.out.println("The tank is full");
        } else {
            gasTank.setFuelResidue(gasTank.getFuelResidue() + liters);
        }
    }
}