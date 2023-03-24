import transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            DriverB driverB = new DriverB("А", true, 10);
            DriverD driverD = new DriverD("Б", true, 10);
            DriverC driverC = new DriverC("В", true, 10);

            Car auto = new Car("Бренд авто № " + i, "Модель авто " + i, 1.6, driverB, Car.BodyType.SEDAN);
            Bus bus = new Bus("Бренд автобуса № " + i, "Модель автобуса " + i, 4, driverD, Bus.CapacityType.MEDIUM);
            Truck truck = new Truck("Бренд грузовика № " + i, "Модель грузовика " + i, 4.5, driverC, Truck.LoadType.N1);

            printer(auto);
            printer(bus);
            printer(truck);
            diagn(auto, truck, bus);


        }
    }

    private static void printer(Transport transport) {

        System.out.println("Водитель " + transport.getDriver().getFIO() + ", имеет категорию прав: "
                + transport.getDriver() + ", стаж вождения: " + transport.getDriver().getExperience()
                + transport.getDriver());
    }
    private static void diagn(Transport ... transports) {
        for (Transport transport : transports) {
            try {
                transport.doDiagnostics();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());

            }
        }
    }

}


