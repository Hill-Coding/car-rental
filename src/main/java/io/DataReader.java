package io;

import car.model.*;

import java.math.BigDecimal;
import java.util.Scanner;

public class DataReader {

    Scanner scanner = new Scanner(System.in);

    public int readInt() {
        try {
            return scanner.nextInt();
        } finally {
            scanner.nextLine();
        }
    }

    public String readString() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }

    public Car readAndCreateCar() {
        System.out.println("Marka:");
        String brand = scanner.nextLine();

        System.out.println("Model:");
        String model = scanner.nextLine();

        System.out.println("Pojemność silnika:");
        double capacity = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Moc silnika:");
        int power = scanner.nextInt();
        scanner.nextLine();
        Car.Engine engine = new Car.Engine(capacity, power);

        System.out.println("Typ silnika:");
        String engineTypeString = scanner.nextLine();
        EngineType engineType = EngineType.valueOf(engineTypeString);

        System.out.println("Skrzynia biegów:");
        String gearboxString = scanner.nextLine();
        Gearbox gearbox = Gearbox.valueOf(gearboxString);

        System.out.println("Cena bazowa:");
        BigDecimal basePrice = BigDecimal.valueOf(scanner.nextDouble());
        scanner.nextLine();

        System.out.println("VIN:");
        String vin = scanner.nextLine();

        System.out.println("Rok produkcji:");
        String productionYear = scanner.nextLine();

        System.out.println("Typ samochodu:");
        String carTypeString = scanner.nextLine();
        CarType carType = CarType.valueOf(carTypeString);

        System.out.println("Segment:");
        String segmentString = scanner.nextLine();
        CarSegment carSegment = CarSegment.valueOf(segmentString);

        System.out.println("Liczba siedzeń:");
        int numberOfSeats = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dostępność:");
        System.out.println("For tests is always 'true'");

        return new Car(brand, model, engine, engineType, gearbox, basePrice, vin,
                productionYear, carType, carSegment, numberOfSeats, true);
    }
}
