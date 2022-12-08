package by.tms3.shuttle.model;

import by.tms3.shuttle.utils.IStart;

import java.util.Scanner;

public class SpaceX implements IStart {

    @Override
    public boolean checkStartSystems() {
        boolean checkStart = false;
        Scanner console = new Scanner(System.in);
        if (console.hasNext()) {
            if (console.nextInt() > 100) {
                checkStart = true;
            } else {
                checkStart = false;
            }
        } else {
            System.out.println("Enter tne number");
            console.nextInt();
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
