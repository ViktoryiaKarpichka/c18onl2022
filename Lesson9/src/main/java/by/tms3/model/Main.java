package by.tms3.model;

public class Main {
    public static void main(String[] args) {
        Transport light = Light.builder()
                .power(100)
                .maxSpeed(150)
                .weight(2)
                .brand("Nissan")
                .wheels(4)
                .fuelConsumption(10)
                .bodyType("Sedan")
                .countPassengers(5)
                .build();

        Transport freight = Freight.builder()
                .power(200)
                .maxSpeed(140)
                .weight(4)
                .brand("Камаз")
                .wheels(6)
                .fuelConsumption(20)
                .carryingCapacity(1000)
                .build();


        Transport civil = Civil.builder()
                .power(1000)
                .maxSpeed(500)
                .weight(10)
                .brand("Boing")
                .wingspan(10)
                .minRunwayLength(15)
                .countPassengers(180)
                .businessClass(true)
                .build();

        Transport military = Military.builder()
                .power(1500)
                .maxSpeed(750)
                .weight(7)
                .brand("Cy")
                .wingspan(6)
                .minRunwayLength(5)
                .catapultSystem(true)
                .countRockets(10)
                .build();

        Transportable[] transports = {civil, military, light, freight};
        for (Transportable transport : transports) {
            System.out.println(transport);
            if (transport instanceof Light) {
                Light lightTransport = (Light) transport;
                lightTransport.info(10);
            } else if (transport instanceof Military) {
                Military transport1 = (Military) transport;
                transport1.shoot();
            }
        }
    }
}
