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
    }

    public void deleteCarByVin(String vin) {
        Car carToDelete = cars.stream()
                .filter(car -> car.getVin().equals(vin))
                .findFirst()
                .orElseThrow(CarNotFoundException::new);
        cars.remove(carToDelete);
    }

    public void printAllCars() {
        cars.forEach(System.out::println);
    }
}