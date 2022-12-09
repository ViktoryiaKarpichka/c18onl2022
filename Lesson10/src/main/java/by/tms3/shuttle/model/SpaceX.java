package by.tms3.shuttle.model;

import by.tms3.shuttle.utils.IStart;

import java.util.Scanner;

public class SpaceX implements IStart {
private Scanner console = new Scanner(System.in);
    @Override
    public boolean checkStartSystems() {
        boolean checkStart = false;
        if (console.hasNextInt()) {
            if (console.nextInt() > 100) {
                checkStart = true;
            }
        } else {
            checkStart = false;
        }
        return checkStart;
    }


    @Override
    public void engineStart() {
        System.out.println("SpaceX engines launched.All systems are normal");
    }

    @Override
    public void start() {
        System.out.println("Start SpaceX");
    }
}
