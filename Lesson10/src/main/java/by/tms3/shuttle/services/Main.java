package by.tms3.shuttle.services;

import by.tms3.shuttle.model.Shuttle;
import by.tms3.shuttle.model.SpaceX;
import by.tms3.shuttle.model.Spaceport;

public class Main {
    public static void main(String[] args) {
        Spaceport shuttle = new Spaceport(new Shuttle());
        shuttle.launch();
        Spaceport spaceX = new Spaceport(new SpaceX());
        spaceX.launch();
    }
}
