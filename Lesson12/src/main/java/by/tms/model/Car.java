package by.tms.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Car implements ICar {
    private final Engine engine;
    private GasTank gasTank;
    private double countAllDistance;
    private Random random = new Random();

    public Car(Engine engine, GasTank gasTank) {
        this.engine = engine;
        this.gasTank = gasTank;
    }

    public void startCar() throws CarNotStartException {
        if (random.nextInt(21) % 2 != 0 && checkFuel()) {
            engine.engineOn();
        } else if (random.nextInt(21) % 2 != 0 && !checkFuel()) {
            System.out.println("заправь машину");
        } else {
            throw new CarNotStartException("машина не завелась");
        }
    }

    public void stopCar() {
        if (engine.isMotorOn()) {
            engine.engineStop();
        } else {
            System.out.println("Машина не заведена");
        }
    }

    private boolean checkFuel() {
        if (gasTank.getFuelQuantity() > 0) {
            return true;
        } else {
            System.out.println("Нет топлива");
            return false;
        }
    }


    public void wentCar(double distance) {
        if (gasTank.getFuelQuantity() == 0) {
            System.out.println("Машина заглохла - нужно заправится");
            engine.setMotorOn(false);
        } else if (engine.isMotorOn()) {
            countAllDistance += distance;
            double countFuelForDistance = distance / 100 * 10;
            if (gasTank.getFuelQuantity() >= countFuelForDistance) {
                gasTank.setFuelQuantity(gasTank.getFuelQuantity() - countFuelForDistance);
            } else {
                System.out.println("Топлива не хватит");
            }
            System.out.println("Машина проехала " + distance + " км и затратила топлива " +
                    countFuelForDistance + " в баке осталось " + gasTank.getFuelQuantity());
        }
    }

    public void getAllDistance() {
        System.out.println("Машина проехала за все время " + countAllDistance + " км");
    }

    public void getFuelInfo() {
        System.out.println(gasTank.getFuelQuantity());
    }

    public void addFuel(double countFuel) {
        if (countFuel > gasTank.getTotalTankVolume()) {
            System.out.println(" Бак рассчитан на " + gasTank.getTotalTankVolume() + " л");
        } else if (countFuel + gasTank.getFuelQuantity() > gasTank.getTotalTankVolume()) {
            double needFuel = gasTank.getTotalTankVolume() - gasTank.getFuelQuantity();
            System.out.println("Вам нужно " + needFuel + "л, чтобы заправить полный бак");
        } else {
            gasTank.setFuelQuantity(gasTank.getFuelQuantity() + countFuel);
            System.out.println("Машина заправлена на " + countFuel + " л");
            engine.setMotorOn(true);
        }
    }
}
