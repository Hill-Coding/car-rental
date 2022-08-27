package car;

import car.model.Car;
import exception.CarAlreadyExistsException;
import exception.CarNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        if (cars.contains(car)) {
            throw new CarAlreadyExistsException(car);
        }
        cars.add(car);
        System.out.println("Dodano nowy samochód");
    }

    public void deleteCarByVin(String vin) {
        Car carToDelete = cars.stream()
                .filter(car -> car.getVin().equals(vin))
                .findFirst()
                .orElseThrow(CarNotFoundException::new);
        cars.remove(carToDelete);
        System.out.println("Usunięto samochód");
    }

    public void printAllCars() {
        cars.forEach(System.out::println);
    }
}