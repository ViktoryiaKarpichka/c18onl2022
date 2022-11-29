package hw2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(new Engine("petrol"), new GasTank(50));
        car.startCar();
        car.stopCar();
        car.getDistance();
        car.calculateFuelResidue();
        car.refueling(20);
    }
}
