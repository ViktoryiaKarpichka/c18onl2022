package by.mts.service;
import by.mts.model.Computer;
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("intel core i5", "8 GB", "256 GB", 10);
        computer.printInfo();
        System.out.println(computer);
        for (int i = 0; i < 10; i++) {
            computer.on();
            computer.off();
            if (computer.isBurned()) {
                break;
            }
        }
    }
}
