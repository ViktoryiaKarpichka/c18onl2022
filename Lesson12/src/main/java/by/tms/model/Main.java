package by.tms.model;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(new Engine("Petrol", 5), new GasTank(50, 20));
        Car toyota = new Car(new Engine("Diesel", 3), new GasTank(45, 30));
        Car mercedes = new Car(new Engine("Petrol", 5), new GasTank(60, 50));

        try {
            audi.startCar();
            toyota.startCar();
            mercedes.startCar();
        } catch (CarNotStartException e) {
            System.out.println(e.getMessage());
        }
    }
}
