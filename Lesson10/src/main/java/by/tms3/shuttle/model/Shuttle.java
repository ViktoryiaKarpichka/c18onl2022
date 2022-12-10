package by.tms3.shuttle.model;

import by.tms3.shuttle.utils.IStart;

import java.util.Random;

public class Shuttle implements IStart {

    @Override
    public boolean checkStartSystems() {
        Random random = new Random();
        return random.nextInt(11) < 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Shuttle engines launched.All systems are normal");
    }

    @Override
    public void start() {
        System.out.println("Start Shuttle");
    }
}
