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

    public double readDouble() {
        try {
            return scanner.nextDouble();
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
        String brand = readString();

        System.out.println("Model:");
        String model = readString();

        System.out.println("Pojemność silnika:");
        double capacity = readDouble();
        System.out.println("Moc silnika:");
        int power = readInt();
        Car.Engine engine = new Car.Engine(capacity, power);

        System.out.println("Typ silnika:");
        String engineTypeString = readString();
        EngineType engineType = EngineType.valueOf(engineTypeString);

        System.out.println("Skrzynia biegów:");
        String gearboxString = readString();
        Gearbox gearbox = Gearbox.valueOf(gearboxString);

        System.out.println("Cena bazowa:");
        BigDecimal basePrice = BigDecimal.valueOf(readDouble());

        System.out.println("VIN:");
        String vin = readString();

        System.out.println("Rok produkcji:");
        String productionYear = readString();

        System.out.println("Typ samochodu:");
        String carTypeString = readString();
        CarType carType = CarType.valueOf(carTypeString);

        System.out.println("Segment:");
        String segmentString = readString();
        CarSegment carSegment = CarSegment.valueOf(segmentString);

        System.out.println("Liczba siedzeń:");
        int numberOfSeats = readInt();
        scanner.nextLine();

        System.out.println("Dostępność:");
        System.out.println("For tests availability is always 'true'");
        boolean availability = true;

        return new Car(brand, model, engine, engineType, gearbox, basePrice, vin,
                productionYear, carType, carSegment, numberOfSeats, availability);
    }
}
