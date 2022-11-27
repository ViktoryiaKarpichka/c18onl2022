package by.mts.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String centralProcessingUnit;
    private String randomAccessMemory;
    private String hardDiskDrive;
    private int resourceOfFullCycles;
    private boolean isBurned;
    private Random random = new Random(2);
    private Scanner console = new Scanner(System.in);

    public Computer(String centralProcessingUnit, String randomAccessMemory, String hardDiskDrive, int resourceOfFullCycles) {
        this.centralProcessingUnit = centralProcessingUnit;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDiskDrive = hardDiskDrive;
        this.resourceOfFullCycles = resourceOfFullCycles;
    }

    public void printInfo() {
        System.out.println(centralProcessingUnit + " " + randomAccessMemory + " " + hardDiskDrive + " " + resourceOfFullCycles);
    }

    public void on() {
        if (!isBurned && resourceOfFullCycles > 0 && console.nextInt() == random.nextInt(2)) {
            System.out.println("Turning on the computer");
        } else {
            burnOut();
        }
    }

    public void off() {
        if (!isBurned && resourceOfFullCycles > 0) {
            System.out.println("Shutting down the computer");
            resourceOfFullCycles--;
        } else {
            burnOut();
        }
    }

    public void burnOut() {
        System.out.println("Computer burned out");
        isBurned = true;
    }

    public boolean isBurned() {
        return true;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "centralProcessingUnit='" + centralProcessingUnit + '\'' +
                ", randomAccessMemory='" + randomAccessMemory + '\'' +
                ", hardDiskDrive='" + hardDiskDrive + '\'' +
                ", resourceOfFullCycles='" + resourceOfFullCycles + '\'' +
                '}';
    }
}
