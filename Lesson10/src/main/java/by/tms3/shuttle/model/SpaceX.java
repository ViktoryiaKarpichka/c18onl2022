package by.tms3.shuttle.model;

import by.tms3.shuttle.utils.IStart;

import java.util.Scanner;

public class SpaceX implements IStart {

    @Override
    public boolean checkStartSystems() {
        Scanner console = new Scanner(System.in);
        if (console.hasNext()) {
            console.nextInt();
            return true;
        } else {
            return false;
        }
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
