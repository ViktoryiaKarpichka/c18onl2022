package by.mts.service;
import by.mts.model.Computer;
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("intel core i5", "8 GB", "256 GB", 10);
        System.out.println(computer);
        computer.on();
        computer.off();
    }
}
